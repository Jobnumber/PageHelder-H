package com.pageHelder.dao;

import com.pageHelder.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper{

    //查询所有
    public List<User> getAll();

}