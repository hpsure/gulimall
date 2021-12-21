package com.hp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hp.common.utils.PageUtils;
import com.hp.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author hupeng
 * @email hpsure@gmail.com
 * @date 2021-12-19 17:52:58
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

