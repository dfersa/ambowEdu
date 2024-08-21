package com.anbow.self_study_room_manage.view;

import com.anbow.self_study_room_manage.bean.NoticeBean;
import com.anbow.self_study_room_manage.util.InputUtil;
import com.anbow.self_study_room_manage.util.RegularUtil;

import java.time.LocalDateTime;
import java.util.List;

public class NoticeView {
    public static Integer systemView(){
        System.out.println("请输入你要进行的操作: \n 1 新增公告\t2 删除公告\t3 修改公告\t4 查询所有公告\t5返回上一级");
        return RegularUtil.getInt(RegularUtil.CHKCHOICE,"选择必须为:1-5!");
    }
    //CRUD
    public static String addNotice() {
        System.out.println("请输入要增加的公告标题:");
        String a = InputUtil.getString();
        System.out.println("请输入要增加的公告内容:");
        String b = InputUtil.getString();
        LocalDateTime now = LocalDateTime.now();
        String c = now.toString();
        System.out.println("请输入要增加的公告状态:");
        String d = RegularUtil.getString(RegularUtil.CHKNOTICESTATE,"公告状态只能为:未完成/已完成");
        System.out.println("增加成功！");
        return a + ";" + b + ";" +c + ";" +d;
    }
    public static Integer deleteNotice() {
        System.out.println("请输入要删除公告的编号:");
        Integer i = InputUtil.getInt();
        System.out.println("删除成功");
        return i;
    }
    public static String updateNotice(){
        System.out.println("请输入要修改的公告id:");
        Integer a = InputUtil.getInt();
        System.out.println("请输入要修改的公告标题:");
        String b = InputUtil.getString();
        System.out.println("请输入要修改的公告内容:");
        String c = InputUtil.getString();
        LocalDateTime now = LocalDateTime.now();
        String d = now + "";
        System.out.println("请输入要修改的公告状态:");
        String e = RegularUtil.getString(RegularUtil.CHKNOTICESTATE,"公告状态只能为:未完成/已完成");
        System.out.println("更新成功");
        return a + ";" + b + ";" +c + ";" +d + ";" + e;
    }
    public static void selectAllNotice() {
        System.out.println("查询所有公告:");
    }
    public static void show(List<NoticeBean> a) {
        for (NoticeBean b:a) {
            System.out.println(
                    b.getId() + "\t" + b.getTitle() + "\t" + b.getContent() + "\t"
                            + b.getTime() + "\t" + b.getState()
            );
        }
    }
}
