package com.lbj.config;

import com.lbj.service.OrderService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: lbj
 * @create: 2021-11-21 12:39
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean
	public OrderService orderService() {
		return new OrderService();
	}
}
