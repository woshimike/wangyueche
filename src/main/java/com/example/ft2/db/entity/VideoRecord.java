package com.example.ft2.db.entity;

import java.io.Serializable;

public class VideoRecord implements Serializable {
    /**
    * 主键
     */
    private Long id;

    /**
    * 房间内主的流
     */
    private String mainStreamId;

    /**
    * 用户id
     */
    private Long userId;

    /**
    * 房间号
     */
    private String roomId;

    /**
    * 持续时间
     */
    private Long duration;

    /**
    * 创建时间
     */
    private Long createTime;

    /**
    * 录播状态 0:开始混播  1:完成混播
     */
    private Integer status;

    /**
    * 录像地址
     */
    private String url;

    /**
    * 完成日期
     */
    private Long finishTime;

    /**
    * 微信返回:任务ID，全局唯一标识录制任务。
     */
    private Long taskId;

    /**
    * 微信返回:唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    private String requestId;

    /**
    * 腾讯云生成视频文件id
     */
    private String fileId;

    private static final long serialVersionUID = 1L;

    public VideoRecord(Long id, String mainStreamId, Long userId, String roomId, Long duration, Long createTime, Integer status, String url, Long finishTime, Long taskId, String requestId, String fileId) {
        this.id = id;
        this.mainStreamId = mainStreamId;
        this.userId = userId;
        this.roomId = roomId;
        this.duration = duration;
        this.createTime = createTime;
        this.status = status;
        this.url = url;
        this.finishTime = finishTime;
        this.taskId = taskId;
        this.requestId = requestId;
        this.fileId = fileId;
    }

    public VideoRecord() {
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
     * 房间内主的流
     */
    public String getMainStreamId() {
        return mainStreamId;
    }

    /**
     * 房间内主的流
     */
    public void setMainStreamId(String mainStreamId) {
        this.mainStreamId = mainStreamId == null ? null : mainStreamId.trim();
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
     * 房间号
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * 房间号
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    /**
     * 持续时间
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * 持续时间
     */
    public void setDuration(Long duration) {
        this.duration = duration;
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
     * 录播状态 0:开始混播  1:完成混播
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 录播状态 0:开始混播  1:完成混播
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 录像地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 录像地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 完成日期
     */
    public Long getFinishTime() {
        return finishTime;
    }

    /**
     * 完成日期
     */
    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 微信返回:任务ID，全局唯一标识录制任务。
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 微信返回:任务ID，全局唯一标识录制任务。
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 微信返回:唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 微信返回:唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    /**
     * 腾讯云生成视频文件id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 腾讯云生成视频文件id
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mainStreamId=").append(mainStreamId);
        sb.append(", userId=").append(userId);
        sb.append(", roomId=").append(roomId);
        sb.append(", duration=").append(duration);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", url=").append(url);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", taskId=").append(taskId);
        sb.append(", requestId=").append(requestId);
        sb.append(", fileId=").append(fileId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}