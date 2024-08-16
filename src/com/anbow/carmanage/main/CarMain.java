package com.anbow.carmanage.main;

import com.anbow.carmanage.bean.Car;
import com.anbow.carmanage.bean.Dirver;
import com.anbow.carmanage.bean.User;
import com.anbow.carmanage.dao.UserDao;
import com.anbow.carmanage.util.RegularUtil;
import com.anbow.carmanage.view.MainView;

import java.util.List;

public class CarMain {
    static UserDao ud = new UserDao();

    public static void main(String[] args) {
        int ii = 3;
        User t;
        for (;;) {
            String str =  MainView.login();
            String[] strs = str.split(":");
            User user = new User(strs[0],strs[1]);
            if (!ud.judgeInput(user)) {
                ii--;
                t=null;
                if (ii == 0 || ud.judgeLogin(t,ii)) break;
                continue;
            };
            t = ud.login(user);
            ii--;
            if (ii == 0 || ud.judgeLogin(t,ii)) break;
        }
        if (t != null) {
            for (;;){
                int i = MainView.function();
                if (i == 0) {
                    MainView.exit();
                    break;
                }
                if (i < 0 || i > 2) {
                    MainView.errorInput02();
                    continue;
                }
                function(i);
            }
        }
    }

    public static void function(int choice) {
        //1级菜单
        switch (choice) {
            case 1:
                for (;;) {
                    boolean judge = false;
                    int i = MainView.carManage();
                    if (i < 0 || i > 4) {
                        MainView.errorInput04();
                        continue;
                    }
                    //二级菜单
                    switch (i) {
                        case 0:
                            judge = true;
                            break;
                        case 1:
                            for (;;) {
                                String str = MainView.addcar();
                                String[] strs = str.split(":");
                                Car car = new Car(Integer.parseInt(strs[0]),strs[1],strs[2],strs[3],strs[4]);
                                ud.addCar(car);
                                MainView.carAddSuccess();
                                int o = MainView.con();
                                boolean j = false;
                                switch (o) {
                                    case 1:
                                        j = false;
                                        break;
                                    case 2:
                                        j = true;
                                        break;
                                }
                                if (j) break;
                            }
                            break;
                        case 2:
                            List<Car> cars1 = ud.selectCar();
                            MainView.selectCar(cars1);
                            //获取 车辆编号
                            MainView.inputCarNumber();
                            String carId = RegularUtil.getString(RegularUtil.CHKISNUMBER,"必须输入数字！！！");
                            //操作
                            ud.deleteCarId(Integer.parseInt(carId));
                            //循环判断
                            MainView.carDeleteSuccess();
                            break;
                        case 3:
                            String str3 = MainView.oldCar();
                            String[] strs3 = str3.split(":");
                            Car car3 = new Car(Integer.parseInt(strs3[0]),strs3[1],strs3[2],strs3[3],strs3[4]);
                            String str4 = MainView.latestCar();
                            String[] strs4 = str4.split(":");
                            Car car4 = new Car(Integer.parseInt(strs4[0]),strs4[1],strs4[2],strs4[3],strs4[4]);
                            ud.updateCar(car3,car4);
                            MainView.carUpdateSuccess();
                            break;
                        case 4:
                            List<Car> cars = ud.selectCar();
                            MainView.selectCar(cars);
                            break;
                    }
                    if (judge) break;
                }
                break;
            case 2:
                for (;;) {
                    boolean judge = false;
                int j = MainView.driverManage();
                    if (j < 0 || j > 4) {
                        MainView.errorInput04();
                        continue;
                    }
                    switch (j) {
                    case 0:
                        judge = true;
                        break;
                    case 1:
                        String str = MainView.addDriver();
                        String[] strs = str.split(":");
                        Dirver dirver = new Dirver(strs[0]+ " ",strs[1]+ " ",strs[2]+ " ",
                                Integer.parseInt(strs[3]),Integer.parseInt(strs[4]));
                        ud.addDriver(dirver);
                        MainView.driverAddSuccess();
                        judge = true;
                        break;
                    case 2:
                        String str2 = MainView.addDriver();
                        String[] strs2 = str2.split(":");
                        Dirver dirver1 = new Dirver(strs2[0],strs2[1],strs2[2],Integer.parseInt(strs2[3]),
                                Integer.parseInt(strs2[4]));
                        ud.deleteDriver(dirver1);
                        MainView.carDeleteSuccess();
                        judge = true;
                        break;
                    case 3:
                        String str3 = MainView.oldDriver();
                        String[] strs3 = str3.split(":");
                        Dirver dirver3 = new Dirver(strs3[0],strs3[1],strs3[2],Integer.parseInt(strs3[3]),
                                Integer.parseInt(strs3[4]));
                        String str4 = MainView.latestDriver();
                        String[] strs4 = str4.split(":");
                        Dirver dirver4 = new Dirver(strs4[0],strs4[1],strs4[2],Integer.parseInt(strs4[3]),
                                Integer.parseInt(strs4[4]));
                        ud.updateDriver(dirver3,dirver4);
                        MainView.carUpdateSuccess();
                        judge = true;
                        break;
                    case 4:
                        List<Dirver> dirvers = ud.selectDriver();
                        MainView.selectDriver(dirvers);
                        judge = true;
                        break;
                }
                    if (judge) break;
                }
                break;
            default:
                MainView.error();
                break;
        }
    }
}
