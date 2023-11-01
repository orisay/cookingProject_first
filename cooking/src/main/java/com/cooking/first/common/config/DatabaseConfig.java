package com.cooking.first.common.config;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



@Configuration
public class DatabaseConfig {

	@Autowired
	ApplicationContext applicationContext;

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
		//application.properties의 hikari설정을 읽어서 객체를 만들어 던져준다.
	}

	@Bean
	public DataSource dataSource() {
		//설정 객체값으로 데이터 소를 반환한다.
		return new HikariDataSource(hikariConfig());
	}

    @Bean
    SqlSessionFactory makeSqlSessionFactory(DataSource dataSource) throws Exception {
		System.out.println("DB연결 성공");
		final SqlSessionFactoryBean factory = new SqlSessionFactoryBean();

		factory.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource configLocation = resolver.getResource("classpath:mapperConfig.xml");

		factory.setConfigLocation(configLocation);
		return factory.getObject();
	}

	@Bean
	public SqlSessionTemplate makeSqlSession(SqlSessionFactory factory) {
		return new SqlSessionTemplate(factory);
	}

}
