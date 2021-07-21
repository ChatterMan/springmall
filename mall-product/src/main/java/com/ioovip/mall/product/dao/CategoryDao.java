package com.ioovip.mall.product.dao;

import com.ioovip.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-21 16:34:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
