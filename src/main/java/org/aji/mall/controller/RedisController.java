package org.aji.mall.controller;

import lombok.extern.slf4j.Slf4j;
import org.aji.mall.config.CacheConfig;
import org.aji.mall.pojo.Category;
import org.aji.mall.service.ICategoryService;
import org.aji.mall.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private CacheConfig redisConfig;
    @Autowired
    private ICategoryService iCategoryService;

    /**
     * 首先命中内存，如果有则直接返回。如果没有则去sql查询，并将查询结果先存储在缓存中，再返回
     * @param id
     * @return
     */
//    @RequestMapping("/test1")
//    public Category redisStringTest(String id){
//        Category category = (Category) redisUtils.get(id);
//        if(category == null){
//            Category entity = iCategoryService.findById(Integer.parseInt(id));
//            System.out.println("通过持久层mysql查询相关信息："+id);
//            if(entity != null){
//                redisUtils.set(id,entity);
//                return entity;
//            }
//        }
//            return category;
//    }
    @RequestMapping("/test1")
    public Category redisStringTest(String id) {
        return iCategoryService.findById(Integer.parseInt(id));
    }
}
