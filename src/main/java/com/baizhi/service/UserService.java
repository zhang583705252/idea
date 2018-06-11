package com.baizhi.service;

import com.baizhi.entity.User;

public interface UserService {
    void  insertUser(User user);
    User selectUser(User user);

}
