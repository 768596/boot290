package com.study.service;

import com.study.model.mapper.UserMapper;
import com.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 19:13
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public User loginCheck(String username) {
        User u = mapper.loadUserByUsername(username);
        return u;
    }
}
