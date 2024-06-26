package com.example.ft2.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EveryDayKeysUtils {

    private EveryDayKeysUtils() {
    }

    private static class SingleHoler {
        private static EveryDayKeysUtils INSTANCE = new EveryDayKeysUtils();
    }

    public static EveryDayKeysUtils getInstance() {
        return SingleHoler.INSTANCE;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    //昨日总耗时key
    public String getTotalTime(Date date) {
        return "total_time_" + sdf.format(date);
    }

    //昨日通话人数key
    public String getUsedNum(Date date) {
        return "used_num_" + sdf.format(date);
    }

    //昨日充值总金额key
    public String getRechargeAmount(Date date) {
        return "recharge_amount_" + sdf.format(date);
    }

    //昨日登录人数key
    public String getLoginNum(Date date) {
        return "login_num_" + sdf.format(date);
    }

    //昨日日活人数key
    public String getRihuoNum(Date date) {
        return "rihuo_num_" + sdf.format(date);
    }

    //昨日用户消费时长统计
    public String getUserVideoConsume(Long userId, Date date) {
        return RedisKeyConstant.userVideoConsume+userId+"_" + sdf.format(date);
    }
}

