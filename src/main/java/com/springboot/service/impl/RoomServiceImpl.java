package com.springboot.service.impl;

import com.springboot.pojo.Room;
import com.springboot.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tedu on 2017/9/15.
 */
@Service
public class RoomServiceImpl implements RoomService{
    @Override
    public List<Room> findAll() {
        return null;
    }

    @Override
    public void deleteRoom(String[] roomIds) {

    }

    @Override
    public void saveRoom(Room room) {

    }

    @Override
    public Room findRoomById(String roomId) {
        return null;
    }

    @Override
    public void updateRoom(Room room) {

    }
}
