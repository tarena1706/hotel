package com.springboot.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
@RequestMapping("/sysadmin/roomsale")
public class RoomSaleController {
    @RequestMapping("/list")
    //!!!!!!!!!新增功能
    public String list(){
        //根据查询方式查询房间销售榜单
        return "/sysadmin/list";
    }
}
