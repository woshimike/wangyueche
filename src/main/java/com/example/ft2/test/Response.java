package com.example.ft2.test;

import lombok.Data;

@Data
public class Response {
    private Integer errorCode;//0:成功 1：失败
    private String desc;//错误描述
    private Object data;//返回对象

    public static Response success() {
        return success("", "");
    }

    public static Response success(Object data) {
        return success("", data);
    }

    public static Response success(String desc, Object data) {
        Response response = new Response();
        response.setErrorCode(0);
        response.setData(data);
        response.setDesc(desc);
        return response;
    }

    public static Response fail() {
        return fail("", "");
    }

    public static Response fail(String desc) {
        return fail(desc, "");
    }

    public static Response fail(String desc, Object data) {
        Response response = new Response();
        response.setErrorCode(1);
        response.setData(data);
        response.setDesc(desc);
        return response;
    }
}
