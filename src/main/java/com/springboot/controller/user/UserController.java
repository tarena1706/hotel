package com.springboot.controller.user;

import java.util.Date;
import com.springboot.pojo.User;
import com.springboot.service.UserService;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/user")
public class UserController{
	
	@Autowired
	private UserService userService;

	//注册用户
	@RequestMapping("/tocreate")
	public String toCreate(){
		return "/sysadmin/user/jUserCreate";
	}

	//保存用户信息
	@RequestMapping("/save")
	public String saveUser(User user){
		
		userService.saveUser(user);
		//跳转到用户列表页面
		return "redirect:/sysadmin/user/list";
	}
	
	//跳转修改页面  !!!!!!!!!新增功能
	@RequestMapping("/toupdate")
	public String toUpdate(String userId,Model model){
		
		//查询需要修改的数据  表示当前需要修改的数据
		User user = userService.findUserById(userId);
		
		model.addAttribute("user", user);
		return "/sysadmin/user/jUserUpdate";
	}

	//跳转修改页面 !!!!!!!!!新增功能
	@RequestMapping("/update")
	public String upateUser(User user){
		
		userService.updateUser(user);
		
		//页面应该跳转到列表页面
		return "redirect:/sysadmin/user/list";
	}

	//根据日期和房间类型动态查询房间，类型默认全部，时间默认当天 !!!!!!!!!新增功能
	@RequestMapping("/tocheck")
	public String toCheck (Date date, int type){

		//根据日期和房间类型查询房间，类型默认全部，时间默认当天

		return "/sysadmin/user/jUserOrder";
	}
	//!!!!!!!!!新增功能
	@RequestMapping("/toorder")
	public String toOrder (Date date, int Id){

		//预定,返回提示信息，3秒后返回主页

		return "/sysadmin/user/jUser";
	}
	//!!!!!!!!!新增功能
	@RequestMapping("/check")
	public String check (Session s){

		//根据session中查询结果及房间价格

		return "/sysadmin/user/check";
	}
	//!!!!!!!!!新增功能
	@RequestMapping("/topay")
	public String toPay (int roomId){

		//根据关联表中的roomId支付(校验信息是否准确)，更改预定状态，入住房间赋值

		return "/sysadmin/user/pay";
	}

}
