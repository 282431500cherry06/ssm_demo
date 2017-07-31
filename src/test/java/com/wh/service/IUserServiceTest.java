package com.wh.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.util.Assert;

import com.wh.model.User;

@ContextConfiguration(locations = { "/applicationContext.xml"})
public class IUserServiceTest extends AbstractJUnit4SpringContextTests {

	@Resource
	private IUserService userService;
	
	@Test
	public void testgetUserById(){
		int userId = 1;
		User user = userService.getUserById(userId);
		Assert.notNull(user);
	}
}
