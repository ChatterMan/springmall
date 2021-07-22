package com.ioovip.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ioovip.common.utils.PageUtils;
import com.ioovip.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:40:09
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

