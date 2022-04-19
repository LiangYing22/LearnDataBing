package com.innup.learndatabing.utils;

public class ConvertUtil {
    public static String getIdolStartText(int star){
        String starText = null;
        switch (star){
            case 0:
                starText = "无星";
                break;
            case 1:
                starText = "一星";
                break;
            case 2:
                starText = "二星";
                break;
            case 3:
                starText = "三星";
                break;
            case 4:
                starText = "四星";
                break;
            case 5:
            default:
                starText = "五星";
                break;
        }
        return starText;
    }
}
