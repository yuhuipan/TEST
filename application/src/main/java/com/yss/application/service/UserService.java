package com.yss.application.service;

import com.yss.application.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(Long id);
    int insert(User user);
    int update(User user);
    int delete(Long id);
}
