package com.tigerff.security.mapper;

import com.tigerff.security.Bean.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where user_name=#{userName}")
    public MyUser getUserByName(String userName);
}
