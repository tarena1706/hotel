package com.springboot.pojo;

import java.util.Map;

/**
 * 订单信息实体类 ：存放某个订单下的所有商品和对应的购买数量
 *
 * @author zah
 */
public class ProdOrderInfo {
	private ProdOrder order;				// 所属订单
	private Map<Product,Integer> map;	// 商品和购买数量

	public ProdOrder getOrder() {
		return order;
	}
	public void setOrder(ProdOrder order) {
		this.order = order;
	}
	public Map<Product, Integer> getMap() {
		return map;
	}
	public void setMap(Map<Product, Integer> map) {
		this.map = map;
	}
}
