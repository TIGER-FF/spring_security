package com.tigerff.security.service;

import com.tigerff.security.Bean.MyUser;


public interface UserService {
    public MyUser getUserByName(String userName);
}
