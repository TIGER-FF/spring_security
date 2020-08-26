package com.tigerff.security.Bean;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name = "user")
public class MyUser extends BaseModel {
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",type = MySqlTypeConstant.INT)
    private Long id;
    @Column(name = "user_name", type = MySqlTypeConstant.VARCHAR)
    private String userName;
    @Column(name = "password", type = MySqlTypeConstant.VARCHAR)
    private String password;
    //权限---看来视频感觉用枚举好一点--但是不会用
    @Column(name = "authority", type = MySqlTypeConstant.VARCHAR)
    private String authority;
//    public enum ROLE
//    {
//        VIP1,VIP2,VIP3
//    }

//    @Column(name = "authority", type = MySqlTypeConstant.VARCHAR)
//    private String authority;
}
