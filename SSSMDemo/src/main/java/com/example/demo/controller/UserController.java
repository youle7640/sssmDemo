package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by nfplus on 2017/10/27.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String getUserList(@RequestParam("id") Integer id){

            return null;
    }


    @RequestMapping("/rss")
    public void RSS(HttpServletResponse response){

        PrintWriter pw = null;
        try {
            Writer writer = new Writer();
            response.setContentType("text/xml;charset=utf-8");
            pw = response.getWriter();
             pw.print(writer.getChannel2().getFeed("rss"));
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            pw.close();
        }

    }

    @RequestMapping("/getUser")
    public JSONArray getUsers(@RequestParam("id") Integer id){
       return  userService.getUsers(id);
    }
}
