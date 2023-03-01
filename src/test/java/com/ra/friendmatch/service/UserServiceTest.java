package com.ra.friendmatch.service;

import com.ra.friendmatch.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 用户服务测试
 *
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;
//
//    @Test
//    public void testAddUser() {
//        User user = new User();
//        user.setUsername("xxxra");
//        user.setUserAccount("123");
//        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
//        user.setGender(0);
//        user.setUserPassword("xxx");
//        user.setPhone("123");
//        user.setEmail("456");
//        boolean result = userService.save(user);
//        System.out.println(user.getId());
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    public void testUpdateUser() {
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("xxxra");
//        user.setUserAccount("123");
//        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
//        user.setGender(0);
//        user.setUserPassword("xxx");
//        user.setPhone("123");
//        user.setEmail("456");
//        boolean result = userService.updateById(user);
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    public void testDeleteUser() {
//        boolean result = userService.removeById(1L);
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    public void testGetUser() {
//        User user = userService.getById(1L);
//        Assertions.assertNotNull(user);
//    }
//
//    @Test
//    void userRegister() {
//        String userAccount = "ra";
//        String userPassword = "";
//        String checkPassword = "123456";
//        String userCode = "1";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "raxx";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "ra";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "ra42";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "xxxra";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "ra";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//    }

    @Test
    public void testSearchUsersByTags() {
        List<String> tagNameList = Arrays.asList("java", "python");
        List<User> userList = userService.searchUsersByTags(tagNameList);
        Assert.assertNotNull(userList);

    }
}