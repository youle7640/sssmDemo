package com.example.demo.service;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.domain.User;

/**
 * Created by nfplus on 2017/10/27.
 */
public interface UserService {

    public  JSONArray getUsers(Integer id);


     public User selectById(Integer id);
}
