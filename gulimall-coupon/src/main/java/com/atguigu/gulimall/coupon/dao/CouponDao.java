package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author songjiqing
 * @email 1256478037@qq.com
 * @date 2021-01-24 10:55:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
