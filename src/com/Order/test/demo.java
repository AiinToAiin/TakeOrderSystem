package com.Order.test;
import com.Order.test.MySql.ToMySQL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Login log = new Login();
        Adchage adc = new Adchage();
        UserUse uu = new UserUse();
        HashMap<String, String> UserSign = new HashMap<>();
        HashMap<String, String> AdSign = new HashMap<>();
        List<Order> AllShop = new ArrayList<>();
        Sign_in s = new Sign_in();
        Login l = new Login();


        //链接数据库
        ToMySQL.Conn c = new ToMySQL.Conn(); // 创建本类对象
        c.getConnection(); // 调用连接数据库的方法
        // 添加商品信息
        AllShop.add(new Order("鱼香肉丝", 10, 10, "", 10));
        AllShop.add(new Order("豆角茄子", 20, 30, "", 30));
        AllShop.add(new Order("西红柿鸡蛋", 15, 20, "", 20));
        AllShop.add(new Order("香菇油菜", 5, 30, "", 30));

        while (true) {
            switch (menu()) {
                case 1:
                    //注册
                    s.UserMenger(UserSign, AdSign);
                case 2:
                    //登录
                    switch (log.LoginOutCome(UserSign, AdSign)) {
                        case 1:
                            //管理员登录
                            while (true) {
                                if (adc.Adchages(AllShop)) {
                                } else break;
                            }
                            break;
                        case 2:
                            //用户登录
                            while (true) {
                                if (uu.Useruse(AllShop)) {
                                } else break;
                            }
                            break;
                        case 3:
                            //登录无效
                            break;
                    }
            }

        }
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------欢迎进入点餐系统--------");
        System.out.println("1.注册");
        System.out.println("2.登录");
        System.out.println("3.退出");
        int i = sc.nextInt();
        return i;
    }
}
