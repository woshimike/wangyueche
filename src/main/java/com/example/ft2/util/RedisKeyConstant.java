package com.example.ft2.util;



public class RedisKeyConstant {
    //上一次心跳前缀
    public static String lastKey = "last_";
    //剩余时间前缀
    public static String leftKey = "left_";
    //房间号
    public static String roomNumKey = "roomnum_";
    //邀请码
    public static String inviteCode = "invite_code";

    //房间里的人员流ID set
    public static String roomStreamIdKey = "mix_room_stream_id_";
    //同一个用户在同一个房间内 3小时内只有一个 视频录制任务
    public static String createVideoKey = "create_video_";
    //用户当天视频通话消耗时间
    public static String userVideoConsume = "user_video_consume_";
}
