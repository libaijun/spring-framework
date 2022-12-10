package com.lbj;

import com.lbj.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lbj
 * @create 2021-11-21 12:31
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		context.addBeanFactoryPostProcessor(null);

		Object orderService = context.getBean("orderService");
		System.out.println(orderService);
		System.out.println("orderService===" + orderService);
	}
}
