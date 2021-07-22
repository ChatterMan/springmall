package com.ioovip.mall.coupon.dao;

import com.ioovip.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:06:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
