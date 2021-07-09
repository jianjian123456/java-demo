package com.flow.springbootdemo.service;

import com.flow.springbootdemo.bean.User;
import com.flow.springbootdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.Data;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据名字查找用户
     */
    public User selectUserByName(String name){
        return userDao.findUserByName(name);
    }

    /**
     * 查找所有用户
     */
    public List<User> selectAllUser(){
        return userDao.findAllUser();
    }

    /**
     * 新增用户
     */
    public void insertUser(){
        userDao.insertUser((long) 100000,"Bob",25);
        userDao.insertUser((long) 100001,"Dob",29);
    }
}
