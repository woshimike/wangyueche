package com.example.ft2.db.entity;

import java.io.Serializable;
import java.util.Objects;

public class Daily implements Serializable {
    /**
    * 主键
     */
    private Long id;

    /**
    * 所有注册用户数
     */
    private Long userNum;

    /**
    * 今日新增用户数
     */
    private Long incrUserNum;

    /**
    * 昨日时长消费 单位:秒
     */
    private Long totalTime;

    /**
    * 昨日通话人数
     */
    private Long usedNum;

    /**
    * 昨日充值金额 单位:分
     */
    private Long rechargeAmount;

    /**
    * 昨日登录人数
     */
    private Long loginNum;

    /**
    * 昨日日活人数
     */
    private Long rihuoNum;

    /**
    * 系统内总的剩余时长 单位:秒
     */
    private Long systemTotalTime;

    /**
    * 创建时间
     */
    private Long createTime;

    private static final long serialVersionUID = 1L;

    public Daily(Long id, Long userNum, Long incrUserNum, Long totalTime, Long usedNum, Long rechargeAmount, Long loginNum, Long rihuoNum, Long systemTotalTime, Long createTime) {
        this.id = id;
        this.userNum = userNum;
        this.incrUserNum = incrUserNum;
        this.totalTime = totalTime;
        this.usedNum = usedNum;
        this.rechargeAmount = rechargeAmount;
        this.loginNum = loginNum;
        this.rihuoNum = rihuoNum;
        this.systemTotalTime = systemTotalTime;
        this.createTime = createTime;
    }

    public Daily() {
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
     * 所有注册用户数
     */
    public Long getUserNum() {
        return userNum;
    }

    /**
     * 所有注册用户数
     */
    public void setUserNum(Long userNum) {
        this.userNum = userNum;
    }

    /**
     * 今日新增用户数
     */
    public Long getIncrUserNum() {
        return incrUserNum;
    }

    /**
     * 今日新增用户数
     */
    public void setIncrUserNum(Long incrUserNum) {
        this.incrUserNum = incrUserNum;
    }

    /**
     * 昨日时长消费 单位:秒
     */
    public Long getTotalTime() {
        return totalTime;
    }

    /**
     * 昨日时长消费 单位:秒
     */
    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * 昨日通话人数
     */
    public Long getUsedNum() {
        return usedNum;
    }

    /**
     * 昨日通话人数
     */
    public void setUsedNum(Long usedNum) {
        this.usedNum = usedNum;
    }

    /**
     * 昨日充值金额 单位:分
     */
    public Long getRechargeAmount() {
        return rechargeAmount;
    }

    /**
     * 昨日充值金额 单位:分
     */
    public void setRechargeAmount(Long rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    /**
     * 昨日登录人数
     */
    public Long getLoginNum() {
        return loginNum;
    }

    /**
     * 昨日登录人数
     */
    public void setLoginNum(Long loginNum) {
        this.loginNum = loginNum;
    }

    /**
     * 昨日日活人数
     */
    public Long getRihuoNum() {
        return rihuoNum;
    }

    /**
     * 昨日日活人数
     */
    public void setRihuoNum(Long rihuoNum) {
        this.rihuoNum = rihuoNum;
    }

    /**
     * 系统内总的剩余时长 单位:秒
     */
    public Long getSystemTotalTime() {
        return systemTotalTime;
    }

    /**
     * 系统内总的剩余时长 单位:秒
     */
    public void setSystemTotalTime(Long systemTotalTime) {
        this.systemTotalTime = systemTotalTime;
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
        sb.append(", userNum=").append(userNum);
        sb.append(", incrUserNum=").append(incrUserNum);
        sb.append(", totalTime=").append(totalTime);
        sb.append(", usedNum=").append(usedNum);
        sb.append(", rechargeAmount=").append(rechargeAmount);
        sb.append(", loginNum=").append(loginNum);
        sb.append(", rihuoNum=").append(rihuoNum);
        sb.append(", systemTotalTime=").append(systemTotalTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Daily dailyData = (Daily) o;
        return Objects.equals(id, dailyData.id) && Objects.equals(userNum, dailyData.userNum) && Objects.equals(incrUserNum, dailyData.incrUserNum) && Objects.equals(totalTime, dailyData.totalTime) && Objects.equals(usedNum, dailyData.usedNum) && Objects.equals(rechargeAmount, dailyData.rechargeAmount) && Objects.equals(loginNum, dailyData.loginNum) && Objects.equals(rihuoNum, dailyData.rihuoNum) && Objects.equals(systemTotalTime, dailyData.systemTotalTime) && Objects.equals(createTime, dailyData.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userNum, incrUserNum, totalTime, usedNum, rechargeAmount, loginNum, rihuoNum, systemTotalTime, createTime);
    }
}