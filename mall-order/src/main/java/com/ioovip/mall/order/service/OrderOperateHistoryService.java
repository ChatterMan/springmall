package com.ioovip.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ioovip.common.utils.PageUtils;
import com.ioovip.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:40:10
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

