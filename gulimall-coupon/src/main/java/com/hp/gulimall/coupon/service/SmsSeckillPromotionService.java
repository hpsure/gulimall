package com.hp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hp.common.utils.PageUtils;
import com.hp.gulimall.coupon.entity.SmsSeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author hupeng
 * @email hpsure@gmail.com
 * @date 2021-12-21 07:32:11
 */
public interface SmsSeckillPromotionService extends IService<SmsSeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

