package com.example.ft2.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author likun
 */
@Slf4j
public class DingSendMessageUtils {
    private static OkHttpClient okHttpClient = new OkHttpClient();

    public static void sendMarkdown(RestTemplate restTemplate, String msg) {
        try {
            Map<String, String> content = new HashMap<>();
            content.put("content", "Haha:这些用户有开通：" + msg);


            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("msgtype", "text");
            paramMap.put("text", content);


            Request request = new Request.Builder()
                    .addHeader("Content-Type", "application/json")
                    .url("https://oapi.dingtalk.com/robot/send?access_token=cd7c1961304c2abcdd03fefc1a605b2242c5a35f48bd9808c25b9635e0c0e884")
                    .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), JSON.toJSONString(paramMap)))
                    .build();

            String result = okHttpClient.newCall(request).execute().body().string();
            log.info("钉钉接口返回:========{}", result);
        } catch (Exception e) {
            log.error("{}", e);
        }
    }
}
