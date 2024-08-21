package com.anbow.self_study_room_manage.view;

import com.anbow.self_study_room_manage.bean.SeatBean;
import com.anbow.self_study_room_manage.util.InputUtil;
import com.anbow.self_study_room_manage.util.RegularUtil;
import java.util.List;

public class SeatView {
   public static int systemView() {
           System.out.println("请输入你要进行的操作: \n 1 新增座位\t2 删除座位\t3 修改座位\t4 查询所有座位\t5返回上一级");
           return RegularUtil.getInt(RegularUtil.CHKCHOICE,"选择必须为:1-5!");
   }
    public static String addSeat() {
        System.out.println("请输入要增加的座位名:");
        String a = InputUtil.getString();
        System.out.println("请输入要增加的座位状态（1、2）:\n 0 未占用 1 占用");
        //将返回数字改为字符
        int t = InputUtil.getInt();
        String b = "";
         if (t == 1) b = "占用";
         else b = "未占用";
        return a + ";" + b;
    }

    public static Integer deleteSeat() {
        System.out.println("请输入要删除座位的编号:");
        Integer i = InputUtil.getInt();
        System.out.println("删除成功");
        return i;
    }
    public static String updateSeat(){
        System.out.println("请输入要修改的座位id:");
        Integer a = InputUtil.getInt();
        System.out.println("请输入要修改的座位姓名:");
        String b = InputUtil.getString();
        System.out.println("请输入要修改的座位状态:");
        String c = RegularUtil.getString(RegularUtil.CHKSEATSTATE,"座位状态中能为:占用/未占用");
        System.out.println("更新成功");
        return a + ";" + b + ";" + c;
    }
    public static void selectAllSeat() {
        System.out.println("查询所有公告:");
    }
    public static void show(List<SeatBean> a) {
        for (SeatBean b:a) {
            System.out.println(
                    b.getId() + "\t" + b.getName() + "\t" + b.getState()
            );
        }
    }
}
