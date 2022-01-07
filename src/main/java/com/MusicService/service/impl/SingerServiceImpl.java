package com.MusicService.service.impl;

import com.MusicService.dao.SingerDao;
import com.MusicService.entity.Singer;
import com.MusicService.service.SingerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class SingerServiceImpl implements SingerService {
    @Resource
    private SingerDao singerDao;
    //查询所有
    @Override
    public List<Singer> selectAll() {
        List<Singer> singers = singerDao.selectAll();
        return singers;
    }
    //根据id删除
    @Override
    public boolean deleteById(int id) {
         return singerDao.deleteById(id) > 0;
    }
    //修改
    @Override
    public boolean change(Singer singer) {
        return singerDao.change(singer) > 0;
    }
    //添加
    @Override
    public boolean insertSinger(Singer singer) {
        return singerDao.insertSinger(singer) > 0;
    }
    //根据name查询
    @Override
    public Singer selectByName(String name) {
        Singer singer = singerDao.selectByName(name);
        return singer;
    }
}
