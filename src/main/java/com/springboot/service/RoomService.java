package com.springboot.service;

import com.springboot.pojo.Room;
import com.springboot.pojo.User;

import java.util.List;

/**
 * Created by tedu on 2017/9/14.
 */
public interface RoomService {


    List<Room> findAll();

    void deleteRoom(String[] roomIds);

    void saveRoom(Room room);

    Room findRoomById(String roomId);

    void updateRoom(Room room);
}
