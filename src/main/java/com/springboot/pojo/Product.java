package com.springboot.pojo;

/**
 * 商品实体类(对应products表)
 *
 * @author zah
 *
 */
public class Product {
	private String id;            // 商品id
	private String name;        // 商品名称
	private Double price;        // 商品单价
	private String category;    // 商品类别
	private Integer pNum;        // 商品库存
	private String imgurl;        // 商品图片地址
	private String description;    // 商品描述

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Product)) return false;

		Product product = (Product) o;

		return id.equals(product.id);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getpNum() {
		return pNum;
	}

	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", price=" + price +
				", category='" + category + '\'' +
				", pNum=" + pNum +
				", imgurl='" + imgurl + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
