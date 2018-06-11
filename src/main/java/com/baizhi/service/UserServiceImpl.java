package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    //添加用户信息
    @Override
    public void insertUser(User user) {
        userDAO.insert(user);
    }
    //用户登陆

    @Override
    public User selectUser(User user) {
       User us= userDAO.select(user.getUsername());
        if(us!=null){throw new RuntimeException("用户名不存在");}
        else {if(!us.getPassword().equals(user.getPassword())){
                throw new RuntimeException("密码不正确");
             }else{return us;}

        }
         
    }
}
