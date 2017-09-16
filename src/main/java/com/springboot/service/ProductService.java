package com.springboot.service;

import com.springboot.pojo.Product;

import java.util.List;

/**
 * Created by tedu on 2017/9/15.
 */
public interface ProductService {
    public List<Product> findAllByKey(String name, String cate, Double min, Double max);
    public Product findProdById(String id);

}
