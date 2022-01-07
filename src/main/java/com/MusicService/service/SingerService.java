package com.MusicService.service;

import com.MusicService.entity.Singer;

import java.util.List;

public interface SingerService {
    //查询所有
    public List<Singer> selectAll();
    //根据id删除
    public boolean deleteById(int id);
    //修改
    public boolean change(Singer singer);
    //添加
    public boolean insertSinger(Singer singer);
    //根据name查询
    public Singer selectByName(String name);
}
