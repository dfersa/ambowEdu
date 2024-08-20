package com.anbow.self_study_room_manage.dao;

import com.anbow.self_study_room_manage.bean.NoticeBean;
import com.anbow.self_study_room_manage.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NoticeDao {
    //    1 add
    public static void addNoticeDao(NoticeBean noticeBean) throws Exception {
        //获取链接
        Connection conn = ConnectionUtil.getConnection();
        //定义sql 获取 preparedStatement
        String sql = "insert into announcement " +
                "(announcement_biaoti,announcement_neirong,announcement_fabushijian,announcement_gonggaozhuangtai)" +
                "values(?,?,?,?)";
//        获取执行体
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,noticeBean.getTitle());
        ps.setString(2,noticeBean.getContent());
        ps.setString(3,noticeBean.getTime());
        ps.setString(4,noticeBean.getState());
//        执行
        ps.executeUpdate();
//        关闭
        ConnectionUtil.close(conn,ps);
    }
//    2 delete
    public static void deleteNoticeDao(NoticeBean noticeBean) throws Exception{
        Connection conn = ConnectionUtil.getConnection();
        String sql = "delete from announcement where announcement_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,noticeBean.getId());
        ps.executeUpdate();
        ConnectionUtil.close(conn,ps);
    }
//    3 update
    public static void updateNoticeDao(NoticeBean noticeBean) throws Exception{
        Connection conn = ConnectionUtil.getConnection();
        String sql = "update announcement set " +
            "announcement_biaoti = ?,announcement_neirong =?," +
            "announcement_fabushijian = ?,announcement_gonggaozhuangtai = ?" +
            "where announcement_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,noticeBean.getTitle());
        ps.setString(2,noticeBean.getContent());
        ps.setString(3,noticeBean.getTime());
        ps.setString(4,noticeBean.getState());
        ps.setInt(5,noticeBean.getId());
        ps.executeUpdate();
        ConnectionUtil.close(conn,ps);
    }
//    4 select
    public static List<NoticeBean> selectAllNoticeDao() throws Exception{
        Connection conn = ConnectionUtil.getConnection();
        String sql = "select * from announcement";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<NoticeBean> a = new ArrayList<>();
        while (rs.next()){
            NoticeBean n = new NoticeBean();
            n.setId(rs.getInt("announcement_id"));
            n.setTitle(rs.getString("announcement_biaoti"));
            n.setContent(rs.getString("announcement_neirong"));
            n.setTime(rs.getString("announcement_fabushijian"));
            n.setState(rs.getString("announcement_gonggaozhuangtai"));
            a.add(n);
        }
        ConnectionUtil.close(conn,ps,rs);
        return a;
    }
}
