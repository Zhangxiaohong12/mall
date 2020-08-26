package com.study.mall.controller;

import com.study.mall.entity.MUser;
import com.study.mall.service.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private MUserService mUserService;

    @GetMapping("/id")
    public Object getById(){
        MUser mUser = mUserService.getById(1L);
        return "Success";
    }

    @PostMapping("/test")
    public String test(){
        return "hello world";
    }

    @PostMapping("/get")
    public Object selectUser(){
        List<MUser> list = mUserService.getList();
        return list;
    }

}
