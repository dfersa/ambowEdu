package com.anbow.carmanage.util;

public class RegularUtil {
    //验证是否是数字
    public static final String CHKISNUMBER = "^[0-9]*$";
    //蓝白黑红四选一,大众奔驰宝马法拉利，司机两个汉字以上
    public static final String CHKCOLOR = "^(蓝色|白色|红色|黑色)$";
    public static final String CHKBRAND = "^(大众|奔驰|宝马|法拉利)$";
    public static final String CHKDRIVER = "[\u4e00-\u9fff]{2,}";

    public static String getString(String str, String message){
        String input = "";
        Boolean flag = true;
        while (flag){
            input = InputUtil.getString();
            boolean a = StringUtil.match(input,str);
            if (a) {
                flag = false;
            }else {
                System.err.println("您输入有误" + message);
            }

        }

        return input;

    }
}
