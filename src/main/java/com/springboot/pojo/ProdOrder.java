package com.springboot.pojo;

import java.util.Date;

/**
 * 订单实体类(对应orders表)
 *
 * @author zah
 *
 */
public class ProdOrder {
	private String id;				// 订单id
	private Integer userId;		// 用户id
	private Integer roomId;		// 用户id
	private Double money;			// 支付金额
	private Integer paystate;		// 付款状态 0表示未付款，1表示已付款
	private Date ordertime;			// 订单的添加时间
	private String receiverinfo;		// 收件人信息

	// Alt+Shift+S->R->Select All
	// Tab->Enter-鼠标点击ok

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getPaystate() {
		return paystate;
	}

	public void setPaystate(Integer paystate) {
		this.paystate = paystate;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public String getReceiverinfo() {
		return receiverinfo;
	}

	public void setReceiverinfo(String receiverinfo) {
		this.receiverinfo = receiverinfo;
	}

}
