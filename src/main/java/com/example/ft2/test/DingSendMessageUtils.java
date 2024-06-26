package com.example.ft2.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class DingSendMessageUtils {

    public static void sendMarkdown(RestTemplate restTemplate, String dingDingToken, Map<String,String> markdown){
        // 请求的JSON数据，这里我用map在工具类里转成json格式
        Map<String,Object> json=new HashMap();
        json.put("msgtype","markdown");
        json.put("markdown",markdown);
        // 发送post请求
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> request = new HttpEntity(json, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(dingDingToken, request , String.class );
        log.info("钉钉接口返回:========{}",response.getBody());
    }

}
