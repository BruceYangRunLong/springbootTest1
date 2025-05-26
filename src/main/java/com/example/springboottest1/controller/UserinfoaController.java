package com.example.springboottest1.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboottest1.entity.Userinfoa;
import com.example.springboottest1.service.IUserinfoaService;
import com.example.springboottest1.service.impl.UserinfoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Bruce
 * @since 2025-05-20
 */

@CrossOrigin
//Spring框架 中用于 处理跨域请求 的注解。它的作用是允许不同域名、协议或端口的客户端访问后端 API

@RestController
//@RequestMapping("/userinfoa")
//public class UserinfoaController {
//
//    @GetMapping("/sayHi")
//    public String sayHello() {
//        return "hello";
//    }
//}
//


@RequestMapping("/userinfoa")
public class UserinfoaController {

    @Autowired
    IUserinfoaService iuserinfoaService;



    @GetMapping("/getUserinfoaById")
    public Userinfoa getUserinfoaById(Integer id){
        Userinfoa userinfoa=iuserinfoaService.getUserinfoaById(id);
        System.out.println("u:"+userinfoa);
        return userinfoa;
    }
    @PostMapping("/updateUserinfoa")
    public boolean updateUserinfoa(Userinfoa userinfoa){
        boolean ok = iuserinfoaService.updateUserinfoa(userinfoa);
        return ok;
    }
    @GetMapping("/deleteUserinfoa")
    public boolean deleteUserinfoa(Integer id){
        boolean ok = iuserinfoaService.deleteUserinfoa(id);
        return ok;
    }
    @PostMapping("/addUserinfoa")
    public boolean addUserinfoa(Userinfoa userinfoa){
        boolean ok = iuserinfoaService.addUserinfoa(userinfoa);
        return ok;
    }



    @PostMapping("/login")
    public boolean login(@RequestBody Userinfoa userinfoa) {
        boolean ok = iuserinfoaService.verifyUserinfoa2(userinfoa);
        return ok;
    }
    @PostMapping("/login2")
    public boolean login2(@RequestBody Userinfoa userinfoa) {
        QueryWrapper<Userinfoa> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",userinfoa.getUsername())
                .eq("password",userinfoa.getPassword());

        Userinfoa userinfoa1= iuserinfoaService.getOne(queryWrapper);
        if(userinfoa1==null){
            return false;
        }
        return true;
    }


    @GetMapping("sayHi")
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @GetMapping("getUserinfoaByName")
    public String getUserinfoaByName(String name) {

        QueryWrapper<Userinfoa> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", name);

        Userinfoa userinfoa= iuserinfoaService.getOne(queryWrapper);

        return userinfoa.toString();
    }



}