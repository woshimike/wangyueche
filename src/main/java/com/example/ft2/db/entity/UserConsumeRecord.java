package com.example.ft2.db.entity;

import java.io.Serializable;

public class UserConsumeRecord implements Serializable {
    /**
    * 主键
     */
    private Long id;

    /**
    * 用户id
     */
    private Long userId;

    /**
    * 消费时长
     */
    private Long consumeDuration;

    /**
    * 创建时间
     */
    private Long createTime;

    private static final long serialVersionUID = 1L;

    public UserConsumeRecord(Long id, Long userId, Long consumeDuration, Long createTime) {
        this.id = id;
        this.userId = userId;
        this.consumeDuration = consumeDuration;
        this.createTime = createTime;
    }

    public UserConsumeRecord() {
        super();
    }

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
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
     * 消费时长
     */
    public Long getConsumeDuration() {
        return consumeDuration;
    }

    /**
     * 消费时长
     */
    public void setConsumeDuration(Long consumeDuration) {
        this.consumeDuration = consumeDuration;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", consumeDuration=").append(consumeDuration);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}