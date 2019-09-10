package com.yss.application.controller;

import com.yss.application.entity.User;
import com.yss.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        System.out.println(userList);
        return null;
    }

    @RequestMapping("findOne/{id}")
    public User findOne(@PathVariable Long id) {
        User user = userService.findOne(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("/insert")
    public int insert(@RequestBody User user) {
        userService.insert(user);
        return 0;
    }

    @RequestMapping("/update")
    public int update(@RequestBody User user) {
        userService.update(user);
        return 0;
    }

    @RequestMapping("/delete/{id}")
    public int delete(@PathVariable Long id) {
        userService.delete(id);
        return 0;
    }
}
