package com.example.ft2.test;

public enum WeChatOrderStatusEnum {

    /**
     * SUCCESS—支付成功
     * REFUND—转入退款
     * NOTPAY—未支付
     * CLOSED—已关闭
     * REVOKED—已撤销（付款码支付）
     * USERPAYING--用户支付中（付款码支付）
     * PAYERROR--支付失败(其他原因，如银行返回失败)
     */

    SUCCESS(1,"支付成功"),
    REFUND(2,"转入退款"),
    NOTPAY(3,"未支付"),
    CLOSED(4,"已关闭"),
    REVOKED(5,"已撤销（付款码支付）"),
    USERPAYING(6,"用户支付中（付款码支付）"),
    PAYERROR(7,"支付失败(其他原因，如银行返回失败)");


    private Integer code;
    private String desc;

    private WeChatOrderStatusEnum(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static WeChatOrderStatusEnum getWeChatOrderStatusEnum(String value) {
        for (WeChatOrderStatusEnum eventEnum : WeChatOrderStatusEnum.values()) {
            if (eventEnum.name().equals(value)) {
                return eventEnum;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
