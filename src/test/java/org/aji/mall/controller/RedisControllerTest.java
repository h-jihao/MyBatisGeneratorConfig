package org.aji.mall.controller;

import org.aji.mall.MallApplicationTests;
import org.aji.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisControllerTest extends MallApplicationTests {
    @Autowired
    private RedisController redisController;

    @Test
    public void redisStringTest() {
        Category category = redisController.redisStringTest("100001");
        System.out.println(category);
    }
}