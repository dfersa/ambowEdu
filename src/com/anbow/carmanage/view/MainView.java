package com.anbow.carmanage.view;

import com.anbow.carmanage.bean.Car;
import com.anbow.carmanage.bean.Dirver;
import com.anbow.carmanage.bean.User;
import com.anbow.carmanage.util.InputUtil;

import java.util.List;

public class MainView {
    //登录界面
    public static String login() {
        System.out.println("--欢迎来到网约车车辆管理系统--");
        System.out.println("--请输入账户--");
        String username = InputUtil.getString();
        System.out.println("--请输入密码--");
        String password = InputUtil.getString();
        return username + ":" + password;
    }

    //登录页面
    public static void loginSuccess(){
        System.out.println("登录成功！！！");
    }

    public static void loginError(int i){
        System.out.println("登录失败！！！");
        System.out.println("您还有" + i + "次机会！！！");
    }

    //登录错误次数
    public static void error2(int num) {
        System.out.println("您还有" + num + "次机会。");
    }

    //  功能页
    public static int function() {
        System.out.println("--欢迎来到车辆信息管理系统--");
        System.out.println("1 车辆信息管理 \t 2 司机信息管理 \t 0 退出系统");
        return InputUtil.getInt();
    }

    //  退出页
    public static void exit() {
        System.out.println("您已退出...");
    }

    //    汽车管理
    public static int carManage() {
        System.out.println("--欢迎来到车辆信息管理模块--");
        System.out.println("1 车辆信息新增 \t 2 车辆信息删除 \t 3 车辆信息修改 \t 4 车辆信息查询 \t 0 返回上一级");
        return InputUtil.getInt();
    }

    //添加页面
    public static String addcar() {
        System.out.println("请依次输入 汽车型号、车牌号、车辆颜色、车辆品牌、车主");
        int a = InputUtil.getInt();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }

    // 添加成功
    public static void carAddSuccess() {
        System.out.println("添加成功！");
    }

    //删除页面 (可加确认删除)
    public static String deleteCar() {
        System.out.println("请依次输入 汽车型号、车牌号、车辆颜色、车辆品牌、车主");
        int a = InputUtil.getInt();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }

    // 删除成功
    public static void carDeleteSuccess() {
        System.out.println("删除成功！");
    }

    //修改页面 (可加确认删除)
    public static String oldCar() {
        System.out.println("请依次输入旧的 汽车型号、车牌号、车辆颜色、车辆品牌、车主");
        int a = InputUtil.getInt();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }

    public static String latestCar() {
        System.out.println("请依次输入新的 汽车型号、车牌号、车辆颜色、车辆品牌、车主");
        int a = InputUtil.getInt();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }

    // 修改成功
    public static void carUpdateSuccess() {
        System.out.println("修改成功！");
    }

    //查询所有车for
    public static void selectCar(List<Car> cars) {
        System.out.println("车辆id \t 车辆型号 \t 车牌号 \t 车辆颜色 \t 车辆品牌 \t 车主");
        for (Car c:cars) {
            System.out.println(c.getCarid() + "\t" + c.getCarmodel()  + "\t" +  c.getCarnumber()  + "\t" +
                    c.getCarcolor()  + "\t" +  c.getCarbrand()  + "\t" +  c.getCardriver());
        }
    }


    //    司机管理
    public static int driverManage() {
        System.out.println("--欢迎来到司机信息管理模块--");
        System.out.println("1 司机信息新增 \t 2 司机信息删除 \t 3 司机信息修改 \t 4 司机信息查询 \t 0 返回上一级");
        return InputUtil.getInt();
    }
    //添加司机页面
    public static String addDriver() {
        System.out.println("请依次输入 司机姓名、司机手机、司机驾照、司机驾龄、司机车的id");
        String a = InputUtil.getString();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }
    //添加旧司机页面
    public static String oldDriver() {
        System.out.println("请依次输入 司机姓名、司机手机、司机驾照、司机驾龄、司机车的id");
        String a = InputUtil.getString();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }
    //添加新司机页面
    public static String latestDriver() {
        System.out.println("请依次输入 司机姓名、司机手机、司机驾照、司机驾龄、司机车的id");
        String a = InputUtil.getString();
        String b = InputUtil.getString();
        String c = InputUtil.getString();
        String d = InputUtil.getString();
        String e = InputUtil.getString();
        return a + ":" + b + ":" + c + ":" + d + ":" + e;
    }
    //查询所有车for
    public static void selectDriver(List<Dirver> dirvers) {
        System.out.println("司机id \t 司机姓名 \t 司机电话 \t 司机驾照 \t 司机驾龄 \t 司机车id");
        for (Dirver c:dirvers) {
            System.out.println(c.getDriverid() + "\t" + c.getDrivername()  + "\t" +  c.getPhone()  + "\t" +
                    c.getDrivertype()  + "\t" +  c.getDrivertime()  + "\t" +  c.getCarid());
        }
    }

    // 添加成功
    public static void driverAddSuccess() {
        System.out.println("添加成功！");
    }

    //    错误页
    public static void error() {
        System.out.println("您输入有误请重新输入");
    }

    //验证提示
    public static void errorName(){
        System.out.println("账户不能为空！！！");
    }
    public static void errorPassword() {
        System.out.println("密码不能为空！！！");
    }
    public static void errorNameLength(){
        System.out.println("账户至少6位字符！！！");
    }
    public static void errorPasswordLength(){
        System.out.println("密码至少6位字符！！！");
    }

}
