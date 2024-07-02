package com.example.ft2.db.entity;

import java.io.Serializable;

public class Order implements Serializable {
    /**
    * 主键id
     */
    private Long id;

    /**
    * 用户id
     */
    private Long userId;

    /**
    * 产品id
     */
    private Long productId;

    /**
    * 业务订单编号
     */
    private String orderNum;

    /**
    * 第三方订单编号(回调生成)
     */
    private String transactionId;

    /**
    * 支付金额（单位：分）
     */
    private Long payAmount;

    /**
    * 支付类型1:微信;0:其他
     */
    private Integer payType;

    /**
    * 支付状态1:未支付;2:提交中;3:已支付;4:支付失败;5:已取消;6:已超时
     */
    private Integer payStatus;

    /**
    * 请求参数json
     */
    private String requestJson;

    /**
    * 第三方支付响应json
     */
    private String responseJson;

    /**
    * 交易完成日期
     */
    private Long successTime;

    /**
    * 主动查询次数
     */
    private Integer queryCount;

    /**
    * 预支付交易会话标识
     */
    private String prepayId;

    /**
    * 创建时间
     */
    private Long createTime;

    /**
    * 最后一次更新时间
     */
    private Long lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Order(Long id, Long userId, Long productId, String orderNum, String transactionId, Long payAmount, Integer payType, Integer payStatus, String requestJson, String responseJson, Long successTime, Integer queryCount, String prepayId, Long createTime, Long lastUpdateTime) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.orderNum = orderNum;
        this.transactionId = transactionId;
        this.payAmount = payAmount;
        this.payType = payType;
        this.payStatus = payStatus;
        this.requestJson = requestJson;
        this.responseJson = responseJson;
        this.successTime = successTime;
        this.queryCount = queryCount;
        this.prepayId = prepayId;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
    }

    public Order() {
        super();
    }

    /**
     * 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 产品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 产品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 业务订单编号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 业务订单编号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    /**
     * 第三方订单编号(回调生成)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 第三方订单编号(回调生成)
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 支付金额（单位：分）
     */
    public Long getPayAmount() {
        return payAmount;
    }

    /**
     * 支付金额（单位：分）
     */
    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 支付类型1:微信;0:其他
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 支付类型1:微信;0:其他
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 支付状态1:未支付;2:提交中;3:已支付;4:支付失败;5:已取消;6:已超时
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 支付状态1:未支付;2:提交中;3:已支付;4:支付失败;5:已取消;6:已超时
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 请求参数json
     */
    public String getRequestJson() {
        return requestJson;
    }

    /**
     * 请求参数json
     */
    public void setRequestJson(String requestJson) {
        this.requestJson = requestJson == null ? null : requestJson.trim();
    }

    /**
     * 第三方支付响应json
     */
    public String getResponseJson() {
        return responseJson;
    }

    /**
     * 第三方支付响应json
     */
    public void setResponseJson(String responseJson) {
        this.responseJson = responseJson == null ? null : responseJson.trim();
    }

    /**
     * 交易完成日期
     */
    public Long getSuccessTime() {
        return successTime;
    }

    /**
     * 交易完成日期
     */
    public void setSuccessTime(Long successTime) {
        this.successTime = successTime;
    }

    /**
     * 主动查询次数
     */
    public Integer getQueryCount() {
        return queryCount;
    }

    /**
     * 主动查询次数
     */
    public void setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
    }

    /**
     * 预支付交易会话标识
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * 预支付交易会话标识
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId == null ? null : prepayId.trim();
    }

    /**
     * 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后一次更新时间
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后一次更新时间
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payType=").append(payType);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", requestJson=").append(requestJson);
        sb.append(", responseJson=").append(responseJson);
        sb.append(", successTime=").append(successTime);
        sb.append(", queryCount=").append(queryCount);
        sb.append(", prepayId=").append(prepayId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}