package com.MusicService.dao;

import com.MusicService.entity.Admin;

import java.util.List;

public interface AdminDao {
    //查询所有管理账户
    public List<Admin> selectAll();
    //根据条件查询是否存在账户
    public Integer verification(String name,String password);
}
