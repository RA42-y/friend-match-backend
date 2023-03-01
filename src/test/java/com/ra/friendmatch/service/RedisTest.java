package com.ra.friendmatch.service;

import com.ra.friendmatch.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("raString", "xxx");
        valueOperations.set("raInt", 1);
        valueOperations.set("raDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("ra");
        valueOperations.set("raUser", user);
        // 查
        Object ra = valueOperations.get("raString");
        Assertions.assertTrue("xxx".equals((String) ra));
        ra = valueOperations.get("raInt");
        Assertions.assertTrue(1 == (Integer) ra);
        ra = valueOperations.get("raDouble");
        Assertions.assertTrue(2.0 == (Double) ra);
        System.out.println(valueOperations.get("raUser"));
//        valueOperations.set("raString", "xxx");
//        stringRedisTemplate.delete("raString");

    }
}
