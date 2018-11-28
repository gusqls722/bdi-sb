package com.example.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class BdiSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdiSbApplication.class, args);
	}
	
	@Bean		// 기존의 root-context 에서 했던 작업 SqlSessionFactoryBean과 같은 작업 인가??
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		ssfb.setDataSource(dataSource);
		Resource[] res = 
				new PathMatchingResourcePatternResolver()
				.getResources("classpath:mapper/*.xml");
		ssfb.setMapperLocations(res);
		return ssfb.getObject();
	}
}
