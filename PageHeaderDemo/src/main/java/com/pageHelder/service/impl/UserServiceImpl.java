package com.pageHelder.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pageHelder.domain.User;
import com.pageHelder.dao.UserMapper;
import com.pageHelder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        List<User> user=userMapper.getAll();
        return user;
    }

    @Override
    public PageInfo<User> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User>list=userMapper.getAll();
        PageInfo<User>pageInfo=new PageInfo<>(list);
        //TODO   因为先进行测试，所以加入打印输出语句，方便测试查看
        for(User user:list){
            System.out.println("user = " + user);
        }
        return pageInfo;
    }
}