package com.springboot.controller.back;

import com.springboot.pojo.Room;
import com.springboot.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by tedu on 2017/9/14.
 */
@Controller
@RequestMapping("/sysadmin/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    //查询全部房间信息//!!!!!!!!!新增功能
    @RequestMapping("/list")
    public String findAll(Model model){
        List<Room> roomList = roomService.findAll();
        model.addAttribute("roomList", roomList);

        //跳转到房间列表页面
        return "/sysadmin/room/jRoomList";
    }

    //通过日期,房间号，房间类型动态查询空闲房间，类型和房间号默认全部，时间默认当天//!!!!!!!!!新增功能
    @RequestMapping("/findbydate")
    public String findByDate(Date date){
        //通过表中提交日期，房间号，房间类型查询当天所有房间状态，类型和房间号默认全部，时间默认当天


        return "/sysadmin/room/bydate";
    }

    //删除房间信息//!!!!!!!!!新增功能
    @RequestMapping("/delete")
    public String toDelete(@RequestParam(value="roomId",required=true)String[] roomIds){

        roomService.deleteRoom(roomIds);

        //删除完成之后，跳转到房间列表页面
        return "redirect:/sysadmin/room/list";
    }

    //跳转修改页面//!!!!!!!!!新增功能
    @RequestMapping("/toupdate")
    public String toUpdate(String roomId,Model model){

        //查询需要修改的数据  表示当前需要修改的数据
        Room room = roomService.findRoomById(roomId);

        model.addAttribute("room", room);
        return "/sysadmin/room/jRoomUpdate";
    }

    //修改房间状态//!!!!!!!!!新增功能
    @RequestMapping("/update")
    public String upateUser(Room room){

        roomService.updateRoom(room);

        //页面应该跳转到列表页面
        return "redirect:/sysadmin/room/list";
    }

}
