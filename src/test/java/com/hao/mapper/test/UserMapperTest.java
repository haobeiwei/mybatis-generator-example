package com.hao.mapper.test;

import java.math.BigDecimal;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hao.mapper.user.UserMapper;
import com.hao.model.user.User;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;

public class UserMapperTest extends BaseMapperTest{
	
	@Test
	public void testInsert() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User record = new User();
		record.setUserName("程咬金");
		record.setAge(18);
		record.setBirthDate(DateUtil.parse("1990-08-20"));
		record.setSalary(new BigDecimal("20000"));
		record.setSex("Y");
		record.setStatus(1);
		userMapper.insert(record);
		
	}
	
	@Test
	public void testSelect() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.selectByPrimaryKey(6l);
		System.out.println(JSONUtil.toJsonPrettyStr(user));
		//手动清空一级缓存
		sqlSession.clearCache();
		
		User user2 = userMapper.selectByPrimaryKey(6l);
		System.out.println(JSONUtil.toJsonPrettyStr(user2));
		
	}
	
}
