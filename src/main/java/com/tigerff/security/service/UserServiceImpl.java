package com.tigerff.security.service;

import com.tigerff.security.Bean.MyUser;
import com.tigerff.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    @Cacheable(value = "user",key = "#userName")//设置缓存，和缓存的key
    public MyUser getUserByName(String userName) {
        MyUser user = userMapper.getUserByName(userName);
        return user;
    }
}
