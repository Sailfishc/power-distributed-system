package com.sailfish.powershardingjdbc.service.impl;

import com.sailfish.powershardingjdbc.entity.User;
import com.sailfish.powershardingjdbc.mapper.UserMapper;
import com.sailfish.powershardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(Long userId) {
        return userMapper.selectById(userId);
    }
}
