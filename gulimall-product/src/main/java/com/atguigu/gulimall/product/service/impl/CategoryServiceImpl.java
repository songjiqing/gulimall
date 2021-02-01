package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> level1 = categoryEntities.stream().
                filter((categoryEntity) -> categoryEntity.getParentCid() == 0
        ).map((item)->{
            //查询父模块的所有子模块
            item.setChildren(getCategoryChildren(item,categoryEntities));
            return item;
        }).sorted((item1,item2)->{
            return (item1.getSort() == null? 0:item1.getSort()) - (item2.getSort() == null? 0:item2.getSort());
        }).collect(Collectors.toList());

        return level1;
    }

    //查询父模块的所有子模块
    private List<CategoryEntity> getCategoryChildren(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntities) {

        List<CategoryEntity> childs = categoryEntities.stream().filter(item -> {
            return item.getParentCid() == categoryEntity.getCatId();
        }).map((item) -> {
            //查询父模块的所有子模块
            item.setChildren(getCategoryChildren(item, categoryEntities));
            return item;
        }).sorted((item1, item2) -> {
            return (item1.getSort() == null? 0:item1.getSort()) - (item2.getSort() == null? 0:item2.getSort());
        }).collect(Collectors.toList());
        return childs;
    }

}