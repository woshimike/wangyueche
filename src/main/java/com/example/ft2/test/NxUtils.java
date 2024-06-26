package com.example.ft2.test;

import redis.clients.jedis.JedisCluster;

import java.util.concurrent.TimeUnit;

public class NxUtils {
    private JedisCluster jedisCluster;
    private boolean start = true;
    private String uuid;
    private String nxKey;

    public NxUtils(JedisCluster jedisCluster, String nxKey, String uuid) {
        try {
            this.jedisCluster = jedisCluster;
            this.uuid = uuid;
            this.nxKey = nxKey;
            while (start) {
                if (uuid.equals(jedisCluster.get(nxKey))) {
                    jedisCluster.expire(nxKey, 1200);
                }
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    protected void finalize() throws Throwable {
//        if (start) {
//            luaCheckAndDel(nxKey, uuid);
//            this.start = false;
//        }
//        super.finalize();
//    }

    ////lua脚本 判断value是否是自己的+删除
    public boolean luaCheckAndDel(String key, String uuid) {
        start = false;
        //lua脚本
        return false;
    }
}
