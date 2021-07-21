package com.ioovip.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ioovip.common.utils.PageUtils;
import com.ioovip.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-21 16:34:21
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

