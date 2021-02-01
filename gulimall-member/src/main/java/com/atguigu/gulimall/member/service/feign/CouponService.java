package com.atguigu.gulimall.member.service.feign;


import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponService {

    @RequestMapping("/coupon/coupon/test")
    public R test();
}
