package com.example.ft2.db.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;

    /**
    * openid
     */
    private String openid;

    /**
    * 昵称
     */
    private String nickName;

    /**
    * 头像
     */
    private String avatarUrl;

    /**
    * 1:男，2：女，3：未知
     */
    private Integer gender;

    /**
    * 国家
     */
    private String country;

    /**
    * 省份
     */
    private String province;

    /**
    * 城市
     */
    private String city;

    /**
    * 语言
     */
    private String language;

    /**
    * 剩余通话时长 单位秒
     */
    private Long leftTime;

    /**
    * 邀请码
     */
    private Long inviteCode;

    /**
    * 邀请人
     */
    private Long inviter;

    /**
    * 创建时间
     */
    private Long createTime;

    /**
    * 是否是会员 0:否 1:是
     */
    private Integer isMember;

    /**
    * 会员到期日
     */
    private Long memberEndTime;

    /**
    * 来源渠道 0:无渠道 1:app内奖励渠道
     */
    private Integer channel;

    private static final long serialVersionUID = 1L;

    public User(Long id, String openid, String nickName, String avatarUrl, Integer gender, String country, String province, String city, String language, Long leftTime, Long inviteCode, Long inviter, Long createTime, Integer isMember, Long memberEndTime, Integer channel) {
        this.id = id;
        this.openid = openid;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        this.language = language;
        this.leftTime = leftTime;
        this.inviteCode = inviteCode;
        this.inviter = inviter;
        this.createTime = createTime;
        this.isMember = isMember;
        this.memberEndTime = memberEndTime;
        this.channel = channel;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * 1:男，2：女，3：未知
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 1:男，2：女，3：未知
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 语言
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 语言
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * 剩余通话时长 单位秒
     */
    public Long getLeftTime() {
        return leftTime;
    }

    /**
     * 剩余通话时长 单位秒
     */
    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }

    /**
     * 邀请码
     */
    public Long getInviteCode() {
        return inviteCode;
    }

    /**
     * 邀请码
     */
    public void setInviteCode(Long inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 邀请人
     */
    public Long getInviter() {
        return inviter;
    }

    /**
     * 邀请人
     */
    public void setInviter(Long inviter) {
        this.inviter = inviter;
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
     * 是否是会员 0:否 1:是
     */
    public Integer getIsMember() {
        return isMember;
    }

    /**
     * 是否是会员 0:否 1:是
     */
    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    /**
     * 会员到期日
     */
    public Long getMemberEndTime() {
        return memberEndTime;
    }

    /**
     * 会员到期日
     */
    public void setMemberEndTime(Long memberEndTime) {
        this.memberEndTime = memberEndTime;
    }

    /**
     * 来源渠道 0:无渠道 1:app内奖励渠道
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * 来源渠道 0:无渠道 1:app内奖励渠道
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openid=").append(openid);
        sb.append(", nickName=").append(nickName);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", gender=").append(gender);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", language=").append(language);
        sb.append(", leftTime=").append(leftTime);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", inviter=").append(inviter);
        sb.append(", createTime=").append(createTime);
        sb.append(", isMember=").append(isMember);
        sb.append(", memberEndTime=").append(memberEndTime);
        sb.append(", channel=").append(channel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}