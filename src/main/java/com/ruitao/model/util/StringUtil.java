package com.ruitao.model.util;

public class StringUtil {

    /**
     * 判断字符串是否为空
     * @param content
     * @return
     */
    public static boolean isBlack(String content){
        if(null!=content && content.length()!=0){
            return false;
        }else{
            return true;
        }
    }
}
