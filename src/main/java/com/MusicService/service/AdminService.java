package com.MusicService.service;

import com.MusicService.entity.Admin;

import java.util.List;

public interface AdminService {
    //查询所有
    public List<Admin> selectAll();
    //根据条件查询得到结果是否存在
    public boolean verification(String name,String password);
}
