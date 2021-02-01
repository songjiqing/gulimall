package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author songjiqing
 * @email 1256478037@qq.com
 * @date 2021-01-24 10:48:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
