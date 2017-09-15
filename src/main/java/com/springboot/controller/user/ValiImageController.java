package com.springboot.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
@RequestMapping("/user/order")
public class ValiImageController {

    @RequestMapping("/caliimage")
    public String ValiImage (Model model){

        //验证码

        return "/sysadmin/user/caliimage";
    }
}
