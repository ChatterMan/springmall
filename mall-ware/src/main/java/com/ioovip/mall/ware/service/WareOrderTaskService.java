package com.ioovip.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ioovip.common.utils.PageUtils;
import com.ioovip.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:46:49
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

