package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author songjiqing
 * @email 1256478037@qq.com
 * @date 2021-01-22 14:23:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
