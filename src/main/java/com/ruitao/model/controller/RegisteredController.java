package com.ruitao.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("registered")
public class RegisteredController extends BaseController {

    @RequestMapping("registered.action")
    public void registered(HttpServletRequest request, HttpServletResponse response){

    }
}
