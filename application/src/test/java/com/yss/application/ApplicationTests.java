package com.yss.application;

import com.yss.application.dao.UserDao;
import com.yss.application.entity.User;
import com.yss.application.enums.UserSexEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert() throws Exception {
        userDao.insert(new User("aa", "a123456", UserSexEnum.MALE));
        userDao.insert(new User("bb", "b123456", UserSexEnum.FEMALE));
        userDao.insert(new User("cc", "c123456", UserSexEnum.FEMALE));

        Assert.assertEquals(3, userDao.findAll().size());
    }


    @Test
    public void testQuery() throws Exception {
        List<User> users = userDao.findAll();
        if(users==null || users.size()==0){
            System.out.println("is null");
        }else{
            System.out.println(users.toString());
        }
    }


    @Test
    public void testUpdate() throws Exception {
        User user = userDao.findOne(3L);
        System.out.println(user.toString());
        user.setNickName("neo");
        userDao.update(user);
        Assert.assertTrue(("neo".equals(userDao.findOne(3L).getNickName())));
    }
}
