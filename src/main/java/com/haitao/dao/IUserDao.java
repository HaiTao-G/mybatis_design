package com.haitao.dao;

import com.haitao.pojo.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有信息
     *
     * @return
     */
//    @Select("select * from user")
    List<User> findAll();
}
