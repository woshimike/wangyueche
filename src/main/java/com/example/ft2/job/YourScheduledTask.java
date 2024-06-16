package com.example.ft2.job;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.ft2.util.DingSendMessageUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author likun
 */
@Component
@Slf4j
public class YourScheduledTask {

    @Autowired
    private RestTemplate restTemplate;

    private static Set<String> all = new HashSet<>();
    private static boolean run = false;

    //@Scheduled(cron = "*/20 * * * * ?")
    public void yourTaskMethod() {
        if (run) {
            return;
        }
        try {
            log.info("---------job start------------");
            run = true;
            File file = new File("d://file.txt");
            if (!file.exists()) {
                log.info("file.txt 不存在");
                return;
            }
            List<String> lines = FileUtils.readLines(file, "utf-8");
            if (CollectionUtils.isEmpty(lines)) {
                return;
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (String line : lines) {
                try {
                    if (StringUtils.isBlank(line)) {
                        continue;
                    }
                    MultiValueMap headers = new LinkedMultiValueMap<>();
                    headers.add("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZGRyZXNzIjoiMHg3ODgyYzU2ZjNiZTg4ODY0ZjdkZmE4NzdlZjdlOGUzMjllN2VhNTI2IiwiaWF0IjoxNjkyNjI5MDgxLCJleHAiOjE2OTUyMjEwODF9._peVk2G-MCl4EtX7lcznUZwP_P9Y4Q1S_rb2WBAwHTU");
                    headers.add("Content-Type", "application/json");
                    headers.add("Sec-Ch-Ua-Platform", "Android");
                    HttpEntity entity = new HttpEntity<>(headers);
                    String url = "https://prod-api.kosetto.com/search/users?username=" + line;
                    ResponseEntity<String> forObjectResp = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
                    String forObject = forObjectResp.getBody();

                    //String forObject = restTemplate.getForObject(URI.create("https://prod-api.kosetto.com/search/users?username=" + line), String.class);

                    if (StringUtils.isBlank(forObject)) {
                        log.info("not found name:{}", line);
                        continue;
                    }
                    JSONObject jsonObject = JSON.parseObject(forObject);
                    if (jsonObject == null) {
                        log.info("not found name:{}", line);
                        continue;
                    }
                    JSONArray users = jsonObject.getJSONArray("users");

                    if (users != null && users.size() > 0 && !all.contains(line)) {
                        stringBuilder.append("\n");
                        stringBuilder.append(line);
                        all.add(line);
                        log.info("@@@@@@@@@@@ {}", forObject);
                    }
                } catch (Exception e) {
                    log.info("not found name:{}", line);
                }
            }
            String s = stringBuilder.toString();
            if (StringUtils.isNotBlank(s)) {
                DingSendMessageUtils.sendMarkdown(restTemplate, s);
            }
            log.info("---------job end------------");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            run = false;
        }
    }
}