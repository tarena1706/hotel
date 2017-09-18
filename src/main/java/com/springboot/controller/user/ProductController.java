package com.springboot.controller.user;

import com.springboot.pojo.Product;
import com.springboot.service.ProductService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by tedu on 2017/9/15.
 */

@Controller
//@RequestMapping("")
public class ProductController {
    //3、创建业务层对象
    @Autowired
    ProductService prodService;

    @RequestMapping("/prodlist")
    public String ProdList(String nameStr, String cateStr, String minpriceStr, String maxpriceStr, Model model,HttpServletRequest request) {
//商品列表
        System.out.println("测试1");
        //1、接收参数
        //String 变量名=request.getParameter("name属性值");

        //2、为null处理
        String name = "";
        String cate = "";
        if (nameStr != null && !"".equals(nameStr.trim())) {
            name = nameStr.trim();
        }
        if (cateStr != null && !"".equals(cateStr.trim())) {
            cate = cateStr.trim();
        }
        Double min = null;
        Double max = null;
        if (minpriceStr != null && !"".equals(minpriceStr.trim())) {
            min = Double.parseDouble(minpriceStr.trim());
        }
        if (maxpriceStr != null && !"".equals(maxpriceStr.trim())) {
            max = Double.parseDouble(maxpriceStr.trim());
        }
        //4、调用查询的方法
        List<Product> list = prodService.findAllByKey(name, cate, min, max);
        //5、将查询关键字和list保存到request作用域中
        request.setAttribute("list",list);
        model.addAttribute("name", name);
        model.addAttribute("cate", cate);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        //测试查询
        System.out.println("测试查询");
        for (Product p:list) {

            System.out.println(p);
        }
        //6、转发到prod_list.jsp
        return "prod_list";
    }

    @RequestMapping("/prodinfo")
    public String prodInfo(String id ,Model model) {
        //商品详情

        //1、接收商品id
      //  String id = request.getParameter("id");
        //2创建业务层对象
        //3、调用根据id查询商品详细的方法
        Product prod = prodService.findProdById(id);
        System.out.println(prod);
        //4、将查询结果保存到request作用域中
        model.addAttribute("prod", prod);
        //5、转发到prod_info.jsp

        return "prod_info";
    }
    @RequestMapping("forw")
  public String forw(String imgurl){

      return "forward:imgurl";
  }
}