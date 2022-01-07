package com.MusicService;

import com.MusicService.entity.Admin;
import com.MusicService.entity.Singer;
import com.MusicService.service.impl.AdminServiceImpl;
import com.MusicService.service.impl.SingerServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@MapperScan("com.MusicService.dao")
@SpringBootTest(classes = MusicServiceApplication.class)
class MusicServiceApplicationTests {

    @Resource
    private AdminServiceImpl adminService;
    @Resource
    private SingerServiceImpl singerService;


    @Test
    void contextLoads() {
//        boolean b = adminService.verification("xiaoai", "123456");
//        System.out.println(b);
//        List<Singer> singers = singerService.selectAll();
//        for (Singer singer : singers) {
//            System.out.println(singer);
//        }
//        Singer singer = singerService.selectByName("周杰伦");
//        System.out.println(singer);
//        Singer s=new Singer(null,"泠鸢",0,"bzhanUP",null);
//        singerService.insertSinger(s);
        boolean b = singerService.deleteById(20);
        System.out.println(b);
    }

}
