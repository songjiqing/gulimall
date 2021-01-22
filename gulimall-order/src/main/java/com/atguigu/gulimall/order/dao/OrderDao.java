package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author songjiqing
 * @email 1256478037@qq.com
 * @date 2021-01-22 14:16:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
