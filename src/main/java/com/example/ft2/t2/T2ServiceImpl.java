package com.example.ft2.t2;

import com.alibaba.excel.util.DateUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.ft2.mybatis.mapper.TotalPointMapper;
import com.example.ft2.mybatis.mapper.UserMapper;
import com.example.ft2.mybatis.po.TotalPoint;
import com.example.ft2.mybatis.po.User;
import com.example.ft2.util.DingSendMessageUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mikeliu
 * 重启电脑手机
 */
@Component
@Slf4j
public class T2ServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TotalPointMapper totalPointMapper;

    private static Set<String> all = new HashSet<>();
    //@Scheduled(cron = "*/20 * * * * ?")
    @PostConstruct
    public void yourTaskMethod() {
    log.info("---------start------------");
        try {
            MultiValueMap headers = new LinkedMultiValueMap<>();
            headers.add("x-token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY1MmZjNDFlOWFhNjFiNWI4MWRmYjc4MCIsImlhdCI6MTcxMjExMjI1NywiZXhwIjoxNzEyNzE3MDU3fQ.FR6s4HkEgs5ff2gVnv-UiKCdxYuiLGEM3rT8UGqwjBw");
            headers.add("Content-Type", "application/json");
            headers.add("User-Agent", "okhttp/4.11.0");
            HttpEntity entity = new HttpEntity<>(headers);
            String url = "https://api.t2t2.com/api/point/get-points-rank?type=&range=";
            ResponseEntity<String> forObjectResp = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
            String forObject = forObjectResp.getBody();

            if (StringUtils.isBlank(forObject)) {
                log.info("not found name:{}");
            }
            JSONObject jsonObject = JSON.parseObject(forObject);
            if (jsonObject == null) {
                log.info("not found name:{}");
            }
            Date date = org.apache.commons.lang3.time.DateUtils.addDays(new Date(), -1);
            String dateStr = DateUtils.format(date, "yyyyMMdd");
            //todo 刪除當天數據在進行加入

            JSONObject jsonObject1 = jsonObject.getJSONObject("result");
            JSONArray users = jsonObject1.getJSONArray("ranks");
            BigDecimal bigDecimal = BigDecimal.ZERO;
            for (int i = 0;i<users.size();i++){
                JSONObject user = users.getJSONObject(i);
                System.out.println("排名："+user.getString("rank")+"    "+"积分："+user.getString("points"));
                User userRecord = new User();
                userRecord.setRank(user.getInteger("rank"));
                userRecord.setRoomId(user.getString("room_id"));
                userRecord.setTwitterUid(user.getString("twitter_uid"));
                userRecord.setTwitterUid(user.getString("user_id"));
                userRecord.setTwitterNickname("");
                userRecord.setBalanceLevel(user.getInteger("balance_level"));
                userRecord.setTwitterUsername(user.getString("twitter_username"));
                userRecord.setT2Id(user.getString("_id"));
                userRecord.setPoints(user.getInteger("points"));
                userRecord.setCreateTime(date);
                userRecord.setDateStr(dateStr);
                userMapper.insert(userRecord);

                BigDecimal point = new BigDecimal(user.getInteger("points"));
                bigDecimal = bigDecimal.add(point);
            }

            TotalPoint totalPoint = new TotalPoint();
            totalPoint.setTotalPoint(bigDecimal.intValue());
            totalPoint.setCreateTime(date);
            totalPoint.setDateStr(DateUtils.format(date, "yyyyMMdd"));
            totalPointMapper.insert(totalPoint);
            System.out.println(bigDecimal);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}