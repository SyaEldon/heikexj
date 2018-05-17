package cn.hkxj.mapper;

import cn.hkxj.pojo.User;


import java.util.List;

public interface UserMapper {
    List<User> queryUserByWhere(User user);
}
