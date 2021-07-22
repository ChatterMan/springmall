package com.ioovip.mall.order.dao;

import com.ioovip.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:40:10
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
