package com.BBS.config;

import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.BBS.interceptor.SessionInterceptor;



@Configuration
@MapperScan(basePackages = {"com.BBS.*.model.dao"})
public class WebMvcConfiguration implements WebMvcConfigurer {
	
	@Autowired
	private SessionInterceptor sessionInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(sessionInterceptor)
			.addPathPatterns(Arrays.asList("/index"));
	}

}
