package com.anbow.self_study_room_manage.util;

public class RegularUtil {
    public static final String CHKNOTICESTATE = "[已完成|未完成]";
    public static final String CHKSEATSTATE = "[0|1]";
    public static final String CHKCHOICE = "[1-5]";

    public static String getString(String str, String message){
        String s = "";
        Boolean flag = true;
        while (flag) {
            s = InputUtil.getString();
            Boolean b = s.matches(str);
            if (b) {
                flag = false;
            }else {
                System.err.println("您输入错误" + message);
            }
        }
        return s;
    }
    public static int getInt(String str, String message){
        String s = "";
        Boolean flag = true;
        while (flag) {
            s = InputUtil.getString();
            Boolean b = s.matches(str);
            if (b) {
                flag = false;
            }else {
                System.err.println("您输入错误" + message);
            }
        }
        return Integer.parseInt(s);
    }
}
