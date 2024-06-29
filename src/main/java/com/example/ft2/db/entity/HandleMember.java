package com.example.ft2.db.entity;

import java.io.Serializable;

public class HandleMember implements Serializable {
    /**
    * 主键
     */
    private Long id;

    /**
    * 用户id
     */
    private Long userId;

    /**
    * 开通会员消耗时长
     */
    private Long score;

    /**
    * 创建时间
     */
    private Long createTime;

    private static final long serialVersionUID = 1L;

    public HandleMember(Long id, Long userId, Long score, Long createTime) {
        this.id = id;
        this.userId = userId;
        this.score = score;
        this.createTime = createTime;
    }

    public HandleMember() {
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
     * 开通会员消耗时长
     */
    public Long getScore() {
        return score;
    }

    /**
     * 开通会员消耗时长
     */
    public void setScore(Long score) {
        this.score = score;
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
        sb.append(", score=").append(score);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}