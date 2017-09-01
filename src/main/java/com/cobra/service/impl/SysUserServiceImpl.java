package com.cobra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobra.mapper.SysUserMapper;
import com.cobra.pojo.SysUser;
import com.cobra.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper userMapper;

	@Override
	public SysUser getUser(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
