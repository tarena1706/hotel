package com.springboot.mapper;

import com.springboot.pojo.User;

import java.util.List;

/**
 * Created by tedu on 2017/9/14.
 */
public interface UserMapper {
    List<User> findAll();
}
