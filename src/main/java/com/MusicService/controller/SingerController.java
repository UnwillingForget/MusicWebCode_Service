package com.MusicService.controller;

import com.MusicService.entity.Singer;
import com.MusicService.service.SingerService;
import com.MusicService.utils.Consts;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("singer")
public class SingerController {
    @Resource
    private SingerService singerService;

    //添加singer
    @RequestMapping(value = "/AddSinger",method = RequestMethod.POST)
    public Object addSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        //获取前段数据
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String introduction = request.getParameter("introduction");
        String photo = request.getParameter("photo");
        //将singer数据保存到singer对象中
        Singer singer = new Singer();
        singer.setName(name);
        singer.setSex(Integer.parseInt(sex));
        singer.setIntroduction(introduction);
        singer.setPhoto(null);
        boolean addSinger = singerService.insertSinger(singer);
        //根据后台数据判断添加成功与否
        if(addSinger){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"Add success!");
        }else {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"Failed to add!");
        }
        return jsonObject;

    }

    //修改singer
    @RequestMapping(value = "/UpdateSinger",method = RequestMethod.POST)
    public Object UpdateSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        //获取前段数据
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String introduction = request.getParameter("introduction");
        String photo = request.getParameter("photo");
        //将singer数据保存到singer对象中
        Singer singer = new Singer();
        singer.setId(Integer.parseInt(id));
        singer.setName(name);
        singer.setSex(Integer.parseInt(sex));
        singer.setIntroduction(introduction);
        singer.setPhoto(photo);
        boolean change = singerService.change(singer);
        //根据后台数据判断添加成功与否
        if(change){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"Change success!");
        }else {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"Failed to Change!");
        }
        return jsonObject;
    }

    //删除singer
    @RequestMapping(value = "/DeleteSinger",method = RequestMethod.GET)
    public Object DeleteSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id");
        boolean deleteSinger = singerService.deleteById(Integer.parseInt(id));
        //根据后台数据判断添加成功与否
        if(deleteSinger){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"Change success!");
        }else {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"Failed to Change!");
        }
        return jsonObject;
    }

    //查询所有singer
    @RequestMapping(value = "/SelectAll",method = RequestMethod.GET)
    public Object SelectAll(){
        List<Singer> singers = singerService.selectAll();
        return singers;
    }

    //按歌手名查询
    @RequestMapping(value = "/SelectByName",method = RequestMethod.POST)
    public Object SelectByName(HttpServletRequest request){
        String name = request.getParameter("name");
        Singer singer = singerService.selectByName(name);
        return singer;
    }
}
