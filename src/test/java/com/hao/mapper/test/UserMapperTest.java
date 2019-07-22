package com.hao.mapper.test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hao.model.user.User;

public class UserMapperTest {
	
	
	public static void main(String[] args) {
		
		try {
			String resource = "/mybatis/mybatis-config.xml";
			 Resource r = new ClassPathResource(resource);
			InputStream inputStream = r.getInputStream();
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			SqlSessionFactory factory = builder.build(inputStream);
			
			SqlSession sqlSession = factory.openSession();
			
			User record = new User();
			record.setAge(1);
			record.setSalary(new BigDecimal(200000.0));
			
			
			sqlSession.insert("com.hao.mapper.user.UserMapper.insert",record);
			sqlSession.commit();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
