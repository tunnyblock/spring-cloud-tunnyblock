package cn.tunnyblock.auth.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.tunnyblock.auth.AuthApplication;
import cn.tunnyblock.auth.entity.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AuthApplication.class)
public class SysUserMapperTest {
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Test
	public void selectListTest() {
		System.out.println(JSON.toJSONString(sysUserMapper.selectList(null)));
	}

	@Test
	public void insertTest() {
		SysUser sysUser = new SysUser();
		sysUser.setUsername("admin");
		System.out.println(sysUserMapper.insert(sysUser));
	}
}
