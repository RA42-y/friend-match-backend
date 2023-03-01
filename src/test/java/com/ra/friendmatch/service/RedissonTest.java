package com.ra.friendmatch.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void test() {
        RList<String> rList = redissonClient.getList("test-list");
//        rList.add("ra");
        rList.get(0);
        System.out.println("rList:" + rList.get(0));
        rList.remove(0);
    }
}
