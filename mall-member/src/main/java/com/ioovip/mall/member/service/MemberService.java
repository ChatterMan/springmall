package com.ioovip.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ioovip.common.utils.PageUtils;
import com.ioovip.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:30:13
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

