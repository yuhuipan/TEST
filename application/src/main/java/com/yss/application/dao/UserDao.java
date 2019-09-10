package com.yss.application.dao;

import com.yss.application.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findOne(Long id);
    int insert(User user);
    int update(User user);
    int delete(Long id);
}
