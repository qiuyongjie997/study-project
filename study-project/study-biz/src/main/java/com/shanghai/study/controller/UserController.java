package com.shanghai.study.controller;


import com.shanghai.study.model.User;
import com.shanghai.study.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author system
 * @since 2022-07-19
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**@author: qyj 查询所有用户信息
     *@return: userList
     */
    @GetMapping("/queryUserInfo")
    public List<User> queryUserInfo(){
        List<User> userList=userService.queryUserInfo();
        return userList;
    }

}

