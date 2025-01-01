package com.example.ft2.db.entity;

import java.io.Serializable;

public class SendScoreSon implements Serializable {
    /**
    * id
     */
    private Long id;

    /**
    * 发放人userId
     */
    private Long sendUserId;

    /**
    * 秒数
     */
    private Integer score;

    /**
    * 发放时间
     */
    private Long sendDateTime;

    /**
    * 对应发放的key(redis存的key)
     */
    private String socreKey;

    /**
    * 接收人userId
     */
    private Long receiveUserId;

    /**
    * 接收时间
     */
    private Long receiveDateTime;

    /**
    * 领取状态 0:未领取 1:已领取 2:已过期
     */
    private Integer status;

    /**
    * 红包类型 0:赠送红包 1:邀请奖励 2:充值奖励
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public SendScoreSon(Long id, Long sendUserId, Integer score, Long sendDateTime, String socreKey, Long receiveUserId, Long receiveDateTime, Integer status, Integer type) {
        this.id = id;
        this.sendUserId = sendUserId;
        this.score = score;
        this.sendDateTime = sendDateTime;
        this.socreKey = socreKey;
        this.receiveUserId = receiveUserId;
        this.receiveDateTime = receiveDateTime;
        this.status = status;
        this.type = type;
    }

    public SendScoreSon() {
        super();
    }

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 发放人userId
     */
    public Long getSendUserId() {
        return sendUserId;
    }

    /**
     * 发放人userId
     */
    public void setSendUserId(Long sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 秒数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 秒数
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 发放时间
     */
    public Long getSendDateTime() {
        return sendDateTime;
    }

    /**
     * 发放时间
     */
    public void setSendDateTime(Long sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    /**
     * 对应发放的key(redis存的key)
     */
    public String getSocreKey() {
        return socreKey;
    }

    /**
     * 对应发放的key(redis存的key)
     */
    public void setSocreKey(String socreKey) {
        this.socreKey = socreKey == null ? null : socreKey.trim();
    }

    /**
     * 接收人userId
     */
    public Long getReceiveUserId() {
        return receiveUserId;
    }

    /**
     * 接收人userId
     */
    public void setReceiveUserId(Long receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    /**
     * 接收时间
     */
    public Long getReceiveDateTime() {
        return receiveDateTime;
    }

    /**
     * 接收时间
     */
    public void setReceiveDateTime(Long receiveDateTime) {
        this.receiveDateTime = receiveDateTime;
    }

    /**
     * 领取状态 0:未领取 1:已领取 2:已过期
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 领取状态 0:未领取 1:已领取 2:已过期
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 红包类型 0:赠送红包 1:邀请奖励 2:充值奖励
     */
    public Integer getType() {
        return type;
    }

    /**
     * 红包类型 0:赠送红包 1:邀请奖励 2:充值奖励
     */
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sendUserId=").append(sendUserId);
        sb.append(", score=").append(score);
        sb.append(", sendDateTime=").append(sendDateTime);
        sb.append(", socreKey=").append(socreKey);
        sb.append(", receiveUserId=").append(receiveUserId);
        sb.append(", receiveDateTime=").append(receiveDateTime);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}