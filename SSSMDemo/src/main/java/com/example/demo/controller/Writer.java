package com.example.demo.controller;

import com.rsslibj.elements.Channel;
import com.rsslibj.elements.Item;

import java.util.Date;

/**
 * Created by nfplus on 2017/10/30.
 */
public class Writer {



    public Channel getChannel1(){

        Channel channel = new Channel();
        Account account = new Account();
        channel.setDescription(account.getDescription());
        channel.setLink("http://uc.nfapp.southcn.com/amuc/upload/attachment/portrait67513at2016111617331479288806336.photo");
        channel.setTitle(account.getTitle());
        Item item = new Item();
        item.setTitle("标题一");
        item.setLink("https://api.nfapp.southcn.com/nanfang_if/getArticle?articleId=562465");
        item.setDescription("这是对xxx的描述");
        item.setDcSource("来源名称");
        item.setDcDate(new Date());

        channel.addItem(item);

        return channel;
    }

    public Channel getChannel2(){

        Channel channel=new Channel();
        channel.setDescription("This is my sample channel.");
        channel.setLink("http://localhost/");
        channel.setTitle("My Channel");
        channel.setImage("http://localhost/",
                "The Channel Image",
                "http://localhost/foo.jpg");
        channel.setTextInput("http://localhost/search",
                "Search The Channel Image",
                "The Channel Image",
                "s");
        channel.addItem("http://localhost/item1",
                "The First Item covers details on the first item>",
                "The First Item")
                .setDcContributor("Joseph B. Ottinger");
        channel.addItem("http://localhost/item2",
                "The Second Item covers details on the second item",
                "The Second Item")
                .setDcCreator("Jason Bell");

        return channel;
    }

}


