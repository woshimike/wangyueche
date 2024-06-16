package com.example.ft2.mybatis.po;

import java.util.Date;

public class User {
    private Integer id;

    private Integer rank;

    private String roomId;

    private String t2Id;

    private String twitterNickname;

    private Integer points;

    private String twitterUid;

    private String twitterUsername;

    private Integer balanceLevel;

    private String dateStr;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getT2Id() {
        return t2Id;
    }

    public void setT2Id(String t2Id) {
        this.t2Id = t2Id;
    }

    public String getTwitterNickname() {
        return twitterNickname;
    }

    public void setTwitterNickname(String twitterNickname) {
        this.twitterNickname = twitterNickname;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getTwitterUid() {
        return twitterUid;
    }

    public void setTwitterUid(String twitterUid) {
        this.twitterUid = twitterUid;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public Integer getBalanceLevel() {
        return balanceLevel;
    }

    public void setBalanceLevel(Integer balanceLevel) {
        this.balanceLevel = balanceLevel;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}