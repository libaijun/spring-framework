package com.lbj.config;

import com.lbj.service.OrderService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lbj
 * @create: 2021-11-21 12:39
 */
@Configuration
public class AppConfig {
	@Bean
	public OrderService orderService() {
		return new OrderService();
	}
}
