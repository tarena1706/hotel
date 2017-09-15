package com.springboot.service.impl;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LYJ on 2017/9/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired    //userMapper对象应该由spring创建
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void deleteUser(String[] userIds) {

    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public User findUserById(String userId) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }
}
