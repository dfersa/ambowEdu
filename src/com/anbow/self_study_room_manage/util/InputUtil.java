package com.anbow.self_study_room_manage.util;

import java.util.Scanner;

//键盘输入类
public class InputUtil {
//    字符串类型
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        for (;;) {
            input = sc.nextLine();
            if (input.equals(" ")) {
                System.out.println("不能输入空字符！");
                continue;
            }
            break;
        }
        return input;
    }
//    整数类型
        public static int getInt() {
            Scanner sc = new Scanner(System.in);
            String i = "";
            boolean flag = false;
           for (;;) {
               i = sc.nextLine();
               if (i.equals(" ")) {
                   System.out.println("不能输入空字符！");
                   continue;
               }
               try {
                   Integer.parseInt(i);
               } catch (Exception e) {
                   System.out.println("必须为数字！");
                   continue;
               }
               break;
           }

            return Integer.parseInt(i);
        }
    }


