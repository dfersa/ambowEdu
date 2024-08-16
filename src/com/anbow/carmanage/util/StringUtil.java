package com.anbow.carmanage.util;

public class StringUtil {
    public static Boolean isNull(String str){
        if (str == null || "".equals(str)){
            return true;
        }
        return false;
    }

    public static Boolean match(String input,String regex){
        if(isNull(input))
            return false;
        else
            return input.matches(regex);
    }

}
