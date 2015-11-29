package com.fotor.service.impl;


import com.fotor.dao.BaseDao;
import com.fotor.model.User;
import com.fotor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseDao baseDao;

    @Override
    public User findUserByName(String name) {
        baseDao.get("userMapper.findUserByName",name);
        return null;
    }
}
