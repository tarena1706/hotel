package com.springboot.mapper;

import com.springboot.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by tedu on 2017/9/15.
 */
public interface ProductMapper {

    List<Product> findAllByKey(@Param("name")String name, @Param("category")String category, @Param("min")Double min, @Param("max")Double max);


    Product findProdById(String id);

}
