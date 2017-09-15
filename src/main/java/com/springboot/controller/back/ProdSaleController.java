package com.springboot.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
@RequestMapping("/sysadmin/prodsale")
public class ProdSaleController {

    @RequestMapping("/list")
    public String list(){
        //查询商品销售榜单
        return "/sysadmin/list";
    }

    @RequestMapping("/download")
    public String download(){
        //榜单下载
        return "/sysadmin/download";
    }

}
