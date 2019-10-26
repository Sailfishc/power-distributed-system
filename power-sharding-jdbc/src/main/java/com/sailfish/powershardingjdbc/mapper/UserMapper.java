package com.sailfish.powershardingjdbc.mapper;

import com.sailfish.powershardingjdbc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    int insert(@Param("user") User user);


    User selectById(@Param("userId") Long userId);
}
