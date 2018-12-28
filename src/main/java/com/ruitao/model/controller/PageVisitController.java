package com.ruitao.model.controller;

import com.ruitao.model.util.StringUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("into")
public class PageVisitController extends BaseController {

    private JSONObject jsonObject ;
    /**
     * 所有访问 由此 分发
     * @param response
     * @param request
     */
    @RequestMapping("visit.action")
    public void visitCountControl(HttpServletResponse response, HttpServletRequest request){
        jsonObject = getJsonObject();
        //目标功能
        String feature_target = request.getParameter("target_feature");
        if(!StringUtil.isBlack(feature_target)){
            //根据功能跳转相应控制器


        }else{
            jsonObject.put("error","target_feature is null");
        }
    }

    // 注册
    public void toRegiest(){

    }

    // 登陆
    public void toLogin(){

    }
}
