package com.hp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hp.common.utils.PageUtils;
import com.hp.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author hupeng
 * @email hpsure@gmail.com
 * @date 2021-12-21 07:58:22
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

