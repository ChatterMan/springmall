package com.ioovip.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ioovip.common.utils.PageUtils;
import com.ioovip.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-21 16:34:21
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

