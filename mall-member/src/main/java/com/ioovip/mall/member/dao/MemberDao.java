package com.ioovip.mall.member.dao;

import com.ioovip.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author max.zhou
 * @email zhouxiang.one@gmail.com
 * @date 2021-07-22 10:30:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
