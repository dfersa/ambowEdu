package com.anbow.self_study_room_manage.main;

import com.anbow.self_study_room_manage.bean.NoticeBean;
import com.anbow.self_study_room_manage.bean.SeatBean;
import com.anbow.self_study_room_manage.dao.NoticeDao;
import com.anbow.self_study_room_manage.dao.SeatDao;
import com.anbow.self_study_room_manage.util.InputUtil;
import com.anbow.self_study_room_manage.view.AdminView;
import com.anbow.self_study_room_manage.view.LoginView;
import com.anbow.self_study_room_manage.view.NoticeView;
import com.anbow.self_study_room_manage.view.SeatView;

import java.util.List;

public class Self_roomManage {
    public static void main(String[] args) throws Exception{
        //调用登录
        //确定人员 登录管理员账户/普通用户
//        LoginView.login();
        //管理员管理页面
//        AdminView.AdminViewSystem();
        //切换到相应界面 switch

        //相应页面操作(用户，座位预约管理、公告，座位管理）

        //座位(增删改查)
        seat();
        //公告(增删改查)
        notice();
//
    }
    public static void notice() throws Exception{
        Boolean a = true;
        while (a){
            switch (NoticeView.systemView()) {
                case 1:
                    //1 提示增加 返回提示  2 操作返回字符串 3 增加操作(公告)
                    String s = NoticeView.addNotice();
                    String[] strs = s.split(";");
                    NoticeBean n = new NoticeBean(strs[0],strs[1],strs[2],strs[3]);
                    NoticeDao.addNoticeDao(n);
                    break;
                case 2:
                    //1 提示全部公告 2 提示删除 返回提示 3 执行操作
                    List<NoticeBean> b1 =  NoticeDao.selectAllNoticeDao();
                    NoticeView.show(b1);

                    Integer id = NoticeView.deleteNotice();
                    NoticeBean m = new NoticeBean(id);
                    NoticeDao.deleteNoticeDao(m);
                    break;
                case 3:
                    //1 提示全部公告 2 提示更改 返回提示 3 执行操作
                    List<NoticeBean> b2 =  NoticeDao.selectAllNoticeDao();
                    NoticeView.show(b2);

                    String s2  = NoticeView.updateNotice();
                    String[] strs2 = s2.split(";");
                    NoticeBean c = new NoticeBean(Integer.parseInt(strs2[0]),strs2[1],strs2[2],strs2[3],strs2[4]);
                    NoticeDao.updateNoticeDao(c);
                    break;
                case 4:
                    NoticeView.selectAllNotice();
                    List<NoticeBean> b =  NoticeDao.selectAllNoticeDao();
                    NoticeView.show(b);
                    break;
                case 5:
                    a = false;
                    break;
            }
        }
    }
    public static void seat() throws Exception{
        Boolean a = true;
        //要求增加删改查 姓名 状态
        while (a){
            switch (SeatView.systemView()) {
                case 1:
                    //1 提示增加 返回提示  2 操作返回字符串 3 增加操作(公告)
                    String s = SeatView.addSeat();
                    String[] strs = s.split(";");
                    SeatBean n = new SeatBean(strs[0],strs[1]);
                    SeatDao.addSeatDao(n);
                    break;
                case 2:
                    //1 提示全部公告 2 提示删除 返回提示 3 执行操作
                    List<SeatBean> b1 =  SeatDao.selectAllSeatDao();
                    SeatView.show(b1);

                    Integer id = SeatView.deleteSeat();
                    SeatBean m = new SeatBean(id);
                    SeatDao.deleteSeatDao(m);
                    break;
                case 3:
                    //1 提示全部公告 2 提示更改 返回提示 3 执行操作
                    SeatView.show(SeatDao.selectAllSeatDao());

                    String s2  = SeatView.updateSeat();
                    String[] strs2 = s2.split(";");
                    SeatBean c = new SeatBean(Integer.parseInt(strs2[0]),strs2[1],strs2[2]);
                    SeatDao.updateSeatDao(c);
                    break;
                case 4:
                    SeatView.selectAllSeat();
                    List<SeatBean> b =  SeatDao.selectAllSeatDao();
                    SeatView.show(b);
                    break;
                case 5:
                    a = false;
                    break;
            }
        }
    }
}

