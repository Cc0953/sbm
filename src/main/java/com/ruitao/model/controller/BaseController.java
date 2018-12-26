package com.ruitao.model.controller;

import net.sf.json.JSONObject;

public class BaseController {


    public void init(){
    }


    protected JSONObject getJsonObject(){

        return new JSONObject();
    }
}
