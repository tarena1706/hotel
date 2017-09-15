package com.springboot.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
@RequestMapping("/user/pay")
public class PayController {

    @RequestMapping("/pay")
    public String Pay (Model model){

        //支付

        return "/sysadmin/user/pay";
    }

}
