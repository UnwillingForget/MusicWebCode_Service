package com.MusicService.service.impl;

import com.MusicService.dao.AdminDao;
import com.MusicService.entity.Admin;
import com.MusicService.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import java.util.List;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;
    @Override
    public List<Admin> selectAll() {
        List<Admin> admins = adminDao.selectAll();
        return admins;
    }

    @Override
    public boolean verification(String name, String password) {
        //验证是否有返回值，有大于零则有值，不满足则无值
        return adminDao.verification(name,password)>0;
    }
}
