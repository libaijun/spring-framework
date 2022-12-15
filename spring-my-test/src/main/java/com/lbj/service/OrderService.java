package com.lbj.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * @author: lbj
 * @create: 2021-11-21 12:40
 */
@Component
public class OrderService {
	@PostConstruct    // java17已经没有javax.annotation.PostConstruct了，变成jakarta.annotation.PostConstruct了
	public void init() {
		System.out.println("===@PostConstruct====");
	}
}
