package com.springboot.pojo;

import java.util.List;

/**
 * 分页对象
 *
 * @author zah
 *
 * @param <T> 指定分页泛型
 */
public class Page<T> {

	private Integer cpn;		// 当前页
	private Integer ps;			// 每页显示条数
	private Integer countpage;	// 总页数
	private Integer countrow;	// 总行数(总记录数)
	private Integer prepage;	// 上一页
	private Integer nextpage;	// 下一页
	private List<Product> list;	// 当前页显示的商品集合

	// 查询条件;
	private String name;		// 商品名称
	private String category;	// 商品分类
	private Double minprice;	// 价格区间下限
	private Double maxprice;	// 价格区间上限

	public Integer getCpn() {
		return cpn;
	}

	public void setCpn(Integer cpn) {
		this.cpn = cpn;
	}

	public Integer getPs() {
		return ps;
	}

	public void setPs(Integer ps) {
		this.ps = ps;
	}

	public Integer getCountpage() {
		return countpage;
	}

	public void setCountpage(Integer countpage) {
		this.countpage = countpage;
	}

	public Integer getCountrow() {
		return countrow;
	}

	public void setCountrow(Integer countrow) {
		this.countrow = countrow;
	}

	public Integer getPrepage() {
		return prepage;
	}

	public void setPrepage(Integer prepage) {
		this.prepage = prepage;
	}

	public Integer getNextpage() {
		return nextpage;
	}

	public void setNextpage(Integer nextpage) {
		this.nextpage = nextpage;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getMinprice() {
		return minprice;
	}

	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}

	public Double getMaxprice() {
		return maxprice;
	}

	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}
}
