package com.springboot.service.impl;

import com.springboot.mapper.ProductMapper;
import com.springboot.pojo.Product;
import com.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tedu on 2017/9/15.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductMapper productMapper;
    @Override

    public List<Product> findAllByKey(String name, String cate, Double min, Double max) {
        List<Product> list=productMapper.findAllByKey(name,cate,min,max);

        return list;
    }

    @Override
    public Product findProdById(String id) {

        return productMapper.findProdById(id);
    }
}
