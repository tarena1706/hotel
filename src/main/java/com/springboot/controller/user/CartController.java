package com.springboot.controller.user;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
@RequestMapping("/user/cart")
public class CartController {

    @RequestMapping("/cart")
    public String Cart (Session s){

        //购物车展示

        return "/sysadmin/user/cart";
    }

    @RequestMapping("/add")
    public String add (Session s){

        //购物车添加

        return "/sysadmin/user/cartadd";
    }

    @RequestMapping("/cartedit")
    public String CartEdit (int oId){

        //购物车修改

        return "/sysadmin/user/cartedit";
    }

    @RequestMapping("/cartdelete")
    public String cartDelete (int oId){

        //购物车删除

        return "/sysadmin/user/cartdelete";
    }
}
