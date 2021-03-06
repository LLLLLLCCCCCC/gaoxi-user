package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.commonservicefacade.LoginReq;
import com.commonservicefacade.UserEntity;
import com.commonservicefacade.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

/**
 * @Company：首都信息发展股份有限公司
 * @Description：
 * @Author：liuchuang
 * @Date：2018/2/9
 */
@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/login")
    public String index() {
        return login("liuchuang", "liuchuang");
    }

    @Override
    public String login(String name, String pwd) {
        return userService.login(name, pwd);
    }
}
