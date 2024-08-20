package com.anbow.self_study_room_manage.view;

import com.anbow.carmanage.util.InputUtil;

public class LoginView {
    public static String login() {
        System.out.println("请输入账户: ");
        Integer account = InputUtil.getInt();
        System.out.println("请输入密码: ");
        String password = InputUtil.getString();
        return account + ";" + password;
    }
}
