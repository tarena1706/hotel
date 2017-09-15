package com.springboot.controller.user;

import com.springboot.pojo.Product;
import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/14.
 */

@Controller
@RequestMapping("/user/order")
public class OrderController {

    @RequestMapping("/add")
    public String Add (){

        //订单添加

        return "/sysadmin/user/add";
    }

    @RequestMapping("/list")
    public String list (){

        //订单列表

        return "/sysadmin/user/list";
    }

    @RequestMapping("/delet")
    public String delet (){

        //订单删除

        return "/sysadmin/user/delet";
    }
}
