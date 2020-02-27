package org.aji.mall.service.impl;

import org.aji.mall.dao.categoryMapper;
import org.aji.mall.pojo.Category;
import org.aji.mall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private categoryMapper mapper;

    @Override
    @Cacheable(value = "categoryInfoList",keyGenerator = "simpleKeyGenerator")
        public Category findById(Integer id) {
            Category category = mapper.selectById(id);
            System.out.println("根据id:"+id+"从sql中查询数据");
            return category;
    }


}
