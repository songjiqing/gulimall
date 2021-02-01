package com.atguigu.gulimall.order.service.feign;


import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponSerivce {

    @RequestMapping("/coupon/coupon/coupons")
    public R coupons();
}
