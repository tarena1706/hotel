package com.springboot.pojo;

/**
 * 订单条目：存放订单和商品的对应关系。
 * <br> 订单id--商品id--商品购买数量
 * @author zah
 *
 */
public class ProdOrderItem {

	private String 	orderId;			// 订单id
	private String 	productId;		// 商品id
	private Integer buynum;			// 商品购买数量

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getBuynum() {
		return buynum;
	}

	public void setBuynum(Integer buynum) {
		this.buynum = buynum;
	}
}
