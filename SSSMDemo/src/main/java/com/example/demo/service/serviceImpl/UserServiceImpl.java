package com.example.demo.service.serviceImpl;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nfplus on 2017/10/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONArray getUsers( Integer id ) {
        User user = userMapper.selectByPrimaryKey(id);
        JSONArray array = new JSONArray();
        array.add(user);
        return array;
    }

    @Override
    public User selectById(Integer id) {
        return null;
    }

}
