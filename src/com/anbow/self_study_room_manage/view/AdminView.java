package com.anbow.self_study_room_manage.view;

import com.anbow.carmanage.util.InputUtil;

public class AdminView {
    public static void AdminViewSystem() {
        System.out.println("请选择您要进行的操作: \n 1.用户管理 2.座位管理 3.座位预约 4.公告管理");
        Integer choice = InputUtil.getInt();

    }
}
