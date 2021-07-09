package com.flow.springbootdemo.dao;

import com.flow.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 通过名字查询用户信息 xml形式的mybatis
     */
//    @Select("SELECT * FROM user01 WHERE name=#{name}")
    User findUserByName(String name);

    /**
     * 查询所有用户
     */
    @Select("SELECT * FROM user01")
    List<User> findAllUser();

    /**
     * 新增用户
     */
    @Insert("INSERT INTO user01(user_id, name, age) VALUES(#{user_id}, #{name}, #{age})")
    void insertUser(@Param("user_id") Long userId, @Param("name") String name,
                    @Param("age") Integer age);
}
