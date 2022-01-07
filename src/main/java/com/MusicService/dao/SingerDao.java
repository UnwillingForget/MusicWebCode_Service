package com.MusicService.dao;

import com.MusicService.entity.Singer;

import java.util.List;

public interface SingerDao {
    //查询所有
    public List<Singer> selectAll();
    //根据id删除
    public Integer deleteById(int id);
    //修改
    public Integer change(Singer singer);
    //添加
    public Integer insertSinger(Singer singer);
    //根据name查询
    public Singer selectByName(String name);

}
