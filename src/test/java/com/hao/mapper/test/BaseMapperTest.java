package com.hao.mapper.test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hao.model.user.User;

public class BaseMapperTest {

	protected SqlSessionFactory sqlSessionFactory;

	// 测试前执行
	@Before
	public void setUp() throws IOException {
		// 配置文件
		String resource = "mybatis/mybatis-config.xml";
		// 的到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建会话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

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

			sqlSession.insert("com.hao.mapper.user.UserMapper.insert", record);

			sqlSession.commit();

			sqlSession.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
