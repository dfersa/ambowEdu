package com.anbow.carmanage.dao;

import com.anbow.carmanage.bean.Car;
import com.anbow.carmanage.bean.Dirver;
import com.anbow.carmanage.bean.User;
import com.anbow.carmanage.util.ConnectionUtil;
import com.anbow.carmanage.view.MainView;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public User login(User user) {
        User u = null;
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            //定义sql 获取 preparedStatement
            String sql = "select * from user where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new User();
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
            }
            ConnectionUtil.close(conn,ps,rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return u;
    }
    //输入账户判断
    //            if (user.getUsername() == "" ) {
    //                MainView.errorName();
    //                flag = false;
    //            }
    //            if (user.getPassword() == "" ) {
    //                MainView.errorPassword();
    //                flag = false;
    //            }
    //            if (user.getUsername().length() < 6 ) {
    //                MainView.errorNameLength();
    //                flag = false;
    //            }
    //            if (user.getPassword().length() < 6 ) {
    //                MainView.errorPasswordLength();
    //                flag = false;
    //            }


    //登录反馈页
    public static boolean judgeLogin(User user,int i) {
        boolean flag;
        if (user != null) {
            flag = true;
            MainView.loginSuccess();
        } else {
           MainView.loginError(i);
            flag = false;
        }
        return flag;
    }
//添加
    public void addCar(Car car) {
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            //定义sql 获取 preparedStatement
            String sql = "insert into car (carmodel,carnumber,carcolor,carbrand,cardriver)values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,car.getCarmodel() );
            ps.setString(2, car.getCarnumber());
            ps.setString(3, car.getCarcolor());
            ps.setString(4, car.getCarbrand());
            ps.setString(5, car.getCardriver());
            ps.executeUpdate();
            ConnectionUtil.close(conn,ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//删除
public void deleteCar(Car car) {
    try {
        //获取连接
        Connection conn = ConnectionUtil.getConnection();
        //定义sql 获取 preparedStatement
        String sql = "delete from car where carmodel=? and carnumber=? and carcolor=? and carbrand=?and cardriver=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,car.getCarmodel() );
        ps.setString(2, car.getCarnumber());
        ps.setString(3, car.getCarcolor());
        ps.setString(4, car.getCarbrand());
        ps.setString(5, car.getCardriver());
        ps.executeUpdate();
        ConnectionUtil.close(conn,ps);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
//修改
public void updateCar(Car car3,Car car4) {
    try {
        //获取连接
        Connection conn = ConnectionUtil.getConnection();
        //定义sql 获取 preparedStatement
        String sql = "update car set carmodel=? , carnumber=? , carcolor=? , carbrand=? , carnumber=? where " +
                "carmodel=? and carnumber=? and carcolor=? and carbrand=?and carnumber=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,car4.getCarmodel() );
        ps.setString(2, car4.getCarnumber());
        ps.setString(3, car4.getCarcolor());
        ps.setString(4, car4.getCarbrand());
        ps.setString(5, car4.getCardriver());
        ps.setInt(6,car3.getCarmodel() );
        ps.setString(7, car3.getCarnumber());
        ps.setString(8, car3.getCarcolor());
        ps.setString(9, car3.getCarbrand());
        ps.setString(10, car3.getCardriver());
        ps.executeUpdate();
        ConnectionUtil.close(conn,ps);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
// 查询所有车
    public List<Car> selectCar() {
        Car car = null;
        List<Car> a = new ArrayList<>();
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            //定义sql 获取 preparedStatement
            String sql = "select * from car";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                car = new Car();
                car.setCarid(rs.getInt("carid"));
                car.setCarmodel(rs.getInt("carmodel"));
                car.setCarnumber(rs.getString("carnumber"));
                car.setCarcolor(rs.getString("carcolor"));
                car.setCarbrand(rs.getString("carbrand"));
                car.setCardriver(rs.getString("cardriver"));
                a.add(car);
            }
            ConnectionUtil.close(conn,ps,rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return a;
    }
    //司机
    //添加
    public void addDriver(Dirver dirver) {
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            //定义sql 获取 preparedStatement
            String sql = "insert into driver (drivername,phone,drivertype,drivertime,carid)values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dirver.getDrivername());
            ps.setString(2,dirver.getPhone() );
            ps.setString(3,dirver.getDrivertype());
            ps.setInt(4,dirver.getDrivertime());
            ps.setInt(5,dirver.getCarid() );
            ps.executeUpdate();
            ConnectionUtil.close(conn,ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //删
    public void deleteDriver(Dirver dirver) {
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            //定义sql 获取 preparedStatement
            String sql = "delete from driver where drivername=? and phone=? and drivertype=? and drivertime=? and carid=?";
//
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dirver.getDrivername());
            ps.setString(2,dirver.getPhone() );
            ps.setString(3,dirver.getDrivertype());
            ps.setInt(4,dirver.getDrivertime());
            ps.setInt(5,dirver.getCarid() );
            ps.executeUpdate();
            ConnectionUtil.close(conn,ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //改
    public void updateDriver(Dirver dirver3,Dirver dirver4) {
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            String sql = "update driver set drivername=?,phone=?,drivertype=?,drivertime=?,carid=? where " +
                    "drivername=? and phone=? and drivertype=? and drivertime=? and carid=?"; ;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dirver4.getDrivername());
            ps.setString(2,dirver4.getPhone() );
            ps.setString(3,dirver4.getDrivertype());
            ps.setInt(4,dirver4.getDrivertime());
            ps.setInt(5,dirver4.getCarid() );
            ps.setString(6,dirver3.getDrivername());
            ps.setString(7,dirver3.getPhone() );
            ps.setString(8,dirver3.getDrivertype());
            ps.setInt(9,dirver3.getDrivertime());
            ps.setInt(10,dirver3.getCarid() );
            ps.executeUpdate();
            ConnectionUtil.close(conn,ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //查
    public List<Dirver> selectDriver() {
        Dirver dirver = null;
        List<Dirver> a = new ArrayList<>();
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConnection();
            //定义sql 获取 preparedStatement
            String sql = "select * from driver";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dirver = new Dirver();
                dirver.setDriverid(rs.getInt("driverid"));
                dirver.setDrivername(rs.getString("drivername"));
                dirver.setPhone(rs.getString("phone"));
                dirver.setDrivertype(rs.getString("drivertype"));
                dirver.setDrivertime(rs.getInt("drivertime"));
                dirver.setCarid(rs.getInt("carid"));
                a.add(dirver);
            }
            ConnectionUtil.close(conn,ps,rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return a;
    }
//    验证

}
