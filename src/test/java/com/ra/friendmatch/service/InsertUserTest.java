package com.ra.friendmatch.service;

import com.ra.friendmatch.mapper.UserMapper;
import com.ra.friendmatch.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@SpringBootTest
public class InsertUserTest {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;

    private ExecutorService executorService = new ThreadPoolExecutor(66, 1000, 10000, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10));

    /**
     * 批量插入用户
     */

//    @Test
//    public void doInsertUser() {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        final int INSERT_NUM = 1000;
//        List<User> userList = new ArrayList<>();
//        for (int i = 0; i < INSERT_NUM; i++) {
//            User user = new User();
//            user.setUsername("fake");
//            user.setUserAccount("fakerara");
//            user.setProfile("fake");
//            user.setAvatarUrl("");
//            user.setGender(0);
//            user.setUserPassword("12345678");
//            user.setPhone("123");
//            user.setEmail("123@gmail.com");
//            user.setUserStatus(0);
//            user.setUserRole(0);
//            user.setUserCode("111111");
//            user.setTags("[]");
//            userList.add(user);
//        }
//        userService.saveBatch(userList, 1000);
//        stopWatch.stop();
//        System.out.println(stopWatch.getTotalTimeMillis());
//    }
//
//    @Test
//    public void doConcurrencyInsertUser() {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        final int INSERT_NUM = 10000;
//
//        int j = 0;
//        int batchSize = 5000;
//        List<CompletableFuture<Void>> futureList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            List<User> userList = new ArrayList<>();
//            while (true) {
//                j++;
//                User user = new User();
//                user.setUsername("fake");
//                user.setUserAccount("fakerara");
//                user.setProfile("fake");
//                user.setAvatarUrl("");
//                user.setGender(0);
//                user.setUserPassword("12345678");
//                user.setPhone("123");
//                user.setEmail("123@gmail.com");
//                user.setUserStatus(0);
//                user.setUserRole(0);
//                user.setUserCode("111111");
//                user.setTags("[]");
//                userList.add(user);
//                if (j % batchSize == 0) {
//                    break;
//                }
//            }
//            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//                userService.saveBatch(userList, batchSize);
//            }, executorService);
//            futureList.add(future);
//        }
//        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[]{})).join();
//
//        stopWatch.stop();
//        System.out.println(stopWatch.getTotalTimeMillis());
//    }
}
