package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{



    List<User> list=List.of(new User(1311L,"Vishal","9324216281"),
            new User(1312L,"Vishal patil","9324216282"),
            new User(1313L,"Vishal k patil","9324216283"));



    @Override
    public User getUser(Long id) {
        // TODO Auto-generated method stub
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
