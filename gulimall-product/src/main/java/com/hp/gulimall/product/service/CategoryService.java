package com.hp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hp.common.utils.PageUtils;
import com.hp.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hupeng
 * @email hpsure@gmail.com
 * @date 2021-12-19 17:52:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List listWithTree();
}

