package com.hp.gulimall.member.feign;

import com.hp.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/smscoupon/member/coupons")
    public R getMembersCoupon();
}
