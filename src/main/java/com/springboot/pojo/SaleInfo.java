package com.springboot.pojo;

/**
 * 商品销售信息
 *
 * @author zah
 *
 */
public class SaleInfo {
	private String prod_id;		// 商品id
	private String prod_name;	// 商品名称
	// (在查询该字段是使用了sum函数[SUM(oi.buynum) sale_num],mysql数据库会自动将这个运算结果用long类型保存)
	private Long sale_num;		// 销售数量

	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public Long getSale_num() {
		return sale_num;
	}
	public void setSale_num(Long sale_num) {
		this.sale_num = sale_num;
	}

}
