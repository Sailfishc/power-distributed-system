package com.sailfish.powershardingjdbc.service;


import com.sailfish.powershardingjdbc.entity.User;

public interface UserService {

    void add(User user);

    User getById(Long userId);
}
