package com.anbow.carmanage.util;

import java.util.Scanner;

//键盘输入类
public class InputUtil {
//    字符串类型
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
//    整数类型
    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
