package com.lbj.service;

/**
 * @author lbj
 * @create 2022-12-13 21:45
 */
public class UserService {
	private OrderService orderService;

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}


	public void test() {
		System.out.println("UserService.orderService===" + orderService);
	}
}
