package com.hp.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hp.common.utils.PageUtils;
import com.hp.common.utils.Query;

import com.hp.gulimall.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.hp.gulimall.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.hp.gulimall.coupon.service.SmsCouponSpuCategoryRelationService;


@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelationEntity> implements SmsCouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuCategoryRelationEntity> page = this.page(
                new Query<SmsCouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}