package cn.tunnyblock.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tunnyblock.auth.entity.SysUser;
import cn.tunnyblock.auth.mapper.SysUserMapper;

@Service
public class SysUserService {
	
	@Autowired
	private SysUserMapper sysUserMapper;


	public SysUser getUserByUsername(String username) {
		return sysUserMapper.selectByUsername(username);
	}
}
