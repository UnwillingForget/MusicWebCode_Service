package com.MusicService.controller;

import com.MusicService.service.AdminService;
import com.MusicService.service.impl.AdminServiceImpl;
import com.MusicService.utils.Consts;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
public class AdminController {
    @Resource
    private AdminService adminService;
    //判断是否登录成功
    @RequestMapping(value = "/admin/login",method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean token = adminService.verification(name, password);
        System.out.println(token);
        if(token){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"Landing success!");
            session.setAttribute(Consts.NAME,name);
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"账号或密码错误");
        return jsonObject;
    }
}
