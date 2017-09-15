package com.springboot.service;

import com.springboot.pojo.User;

import java.util.List;

/**
 * Created by LYJ on 2017/9/12.
 */
public interface UserService {
    public List<User> findAll();

    void deleteUser(String[] userIds);

    void saveUser(User user);

    User findUserById(String userId);

    void updateUser(User user);
}
