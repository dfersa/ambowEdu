package com.anbow.self_study_room_manage.dao;

import com.anbow.self_study_room_manage.bean.NoticeBean;
import com.anbow.self_study_room_manage.bean.SeatBean;
import com.anbow.self_study_room_manage.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SeatDao {
    public static void addSeatDao(SeatBean seatBean) throws Exception {
        //获取链接
        Connection conn = ConnectionUtil.getConnection();
        //定义sql 获取 preparedStatement
        String sql = "insert into seat " +
                "(seat_name,seat_state)" +
                "values(?,?)";
//        获取执行体
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,seatBean.getName());
        if (seatBean.getState().equals("占用"))  ps.setInt(2,1);
       else ps.setInt(2,0);
//        执行
        ps.executeUpdate();
//        关闭
        ConnectionUtil.close(conn,ps);
    }

    //    2 delete
    public static void deleteSeatDao(SeatBean seatBean) throws Exception{
        Connection conn = ConnectionUtil.getConnection();
        String sql = "delete from seat where seat_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,seatBean.getId());
        ps.executeUpdate();
        ConnectionUtil.close(conn,ps);
    }
    //    3 update
    public static void updateSeatDao(SeatBean seatBean) throws Exception{
        Connection conn = ConnectionUtil.getConnection();
        String sql = "update seat set seat_name = ?,seat_state =? where seat_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(3,seatBean.getId());
        ps.setString(1,seatBean.getName());
        if (seatBean.getState().equals("占用"))  ps.setInt(2,1);
        else ps.setInt(2,0);

        ps.executeUpdate();
        ConnectionUtil.close(conn,ps);
    }
    //    4 select
    public static List<SeatBean> selectAllSeatDao() throws Exception{
        Connection conn = ConnectionUtil.getConnection();
        String sql = "select * from Seat";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<SeatBean> a = new ArrayList<>();
        while (rs.next()){
            SeatBean n = new SeatBean();
            n.setId(rs.getInt("seat_id"));
            n.setName(rs.getString("seat_name"));
            //修改状态
            if (rs.getInt("seat_state") == 1){
                n.setState("占用");
            }else n.setState("未占用");

            a.add(n);
        }
        ConnectionUtil.close(conn,ps,rs);
        return a;
    }
}
