package com.Order.test;
import java.util.HashMap;
import java.util.Scanner;


public class Sign_in {
    //注册系统
    public HashMap<String ,String> UserMenger(HashMap<String,String> UserSign,HashMap<String,String> AdSign){
        Admin ad = new Admin();
        User user = new User();
        int id = 0;
        //创建用户名密码
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
        String username = sc.next();
            System.out.println("请输入密码：");
        String userpwd = sc.next();
        System.out.println("请输入管理员代码，没有输入0");
        int Aid = sc.nextInt();
        if(Aid==123){
            ad.setUsername(username);
            ad.setUserpassword(userpwd);
            AdSign.put(username,userpwd);
            System.out.println("管理员创建成功！");

        }
        else if(Aid==0){
            user.setUserName(username);
            user.setUserPassWord(userpwd);
            UserSign.put(username,userpwd);
            System.out.println("用户创建成功！");
            return UserSign;
        }
        else{
            System.out.println("输入错误，重新尝试");
        }
        if(Aid==123){
            return AdSign;
        }
        else {
            return UserSign;
        }
    }
}
