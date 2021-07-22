package com.ioovip.mall.member.dao;

import com.ioovip.mall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:30:12
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
