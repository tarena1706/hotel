package com.springboot.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */
@Controller
@RequestMapping("/sysadmin/product")
public class ProdController {

    @RequestMapping("/changepnum")
    public String changePnum(){
        //修改商品库存（Ajax）
        return "redirect:/sysadmin/product/list";
    }

    @RequestMapping("/delete")
    public String delete(){
        //删除商品,返回结果，根据结果跳转相应页面
        return "redirect:/sysadmin/product/list";
    }

    @RequestMapping("/list")
    public String list(){
        //查询商品列表，跳转到商品列表页面
        return "/sysadmin/prod_list";
    }

    @RequestMapping("/img")
    public String img(){
        //商品图片
        return "";
    }
}