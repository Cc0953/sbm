package com.ruitao.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("Login")
public class LoginController extends BaseController {

    /**
     * 帐号以及密码登陆
     */
    @RequestMapping("usernameAndPassword.action")
    public void u_And_pLogin(HttpServletRequest request, HttpServletResponse response){

    }

    /**
     * 二维码登录
     */

    /**
     * 刷脸
     */

    /**
     * 语音
     */

}
