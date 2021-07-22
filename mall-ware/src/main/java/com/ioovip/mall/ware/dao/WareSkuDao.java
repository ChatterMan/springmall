package com.ioovip.mall.ware.dao;

import com.ioovip.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:46:49
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
