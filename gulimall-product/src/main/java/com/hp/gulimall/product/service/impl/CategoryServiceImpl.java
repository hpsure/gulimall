package com.hp.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hp.common.utils.PageUtils;
import com.hp.common.utils.Query;

import com.hp.gulimall.product.dao.CategoryDao;
import com.hp.gulimall.product.entity.CategoryEntity;
import com.hp.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

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
       List<CategoryEntity> categoryEntityList = categoryDao.selectList(null);


       List<CategoryEntity> level1Menus = categoryEntityList.stream().filter((categoryEntity)->{
          return categoryEntity.getParentCid() == 0;
       }).map((menu)->{
           menu.setChildrenList(getChildrens(menu,categoryEntityList));
           return menu;
       }).sorted((menu1,menu2)->{
           return menu1.getSort() - menu2.getSort();
       }).collect(Collectors.toList());
       return level1Menus;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all) {
        List<CategoryEntity> menus = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map((menu)->{
            menu.setChildrenList(getChildrens(menu,all));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());
        return menus;
    }

}