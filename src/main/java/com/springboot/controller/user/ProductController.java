package com.springboot.controller.user;

import com.springboot.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
@RequestMapping("/user/order")
public class ProductController {

    @RequestMapping("/prodlist")
    public String ProdList (Model model){

        //商品列表

        return "/sysadmin/user/prodlist";
    }

    @RequestMapping("/user/prodinfo")
    public String prodInfo (Product id){

        //商品详情

        return "/user/prodinfo";
    }
}
