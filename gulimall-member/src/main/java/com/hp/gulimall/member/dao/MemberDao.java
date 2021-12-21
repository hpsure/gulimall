package com.hp.gulimall.member.dao;

import com.hp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hupeng
 * @email hpsure@gmail.com
 * @date 2021-12-21 07:46:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
