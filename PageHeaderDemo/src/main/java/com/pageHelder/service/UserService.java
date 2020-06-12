package com.pageHelder.service;

import com.github.pagehelper.PageInfo;
import com.pageHelder.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    /*分页查询
     *返回PageHelper提供的封装分页参数的PageInfo对象
     */
    PageInfo<User> findByPage(int pageNum, int pageSize);
}