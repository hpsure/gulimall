package com.hp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hp.common.utils.PageUtils;
import com.hp.gulimall.coupon.entity.SmsCouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author hupeng
 * @email hpsure@gmail.com
 * @date 2021-12-21 07:32:11
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

