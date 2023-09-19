package com.Order.test;
import com.Order.test.Sign_in;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public int  LoginOutCome(HashMap<String,String> UseSgin,HashMap<String,String> AdSgin){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String username = sc.next();
        System.out.println("请输入您的密码：");
        String userpwd = sc.next();
        //判断是否为管理员登录
        System.out.println("选择是否管理员登录：（是or否）");
        String Pan = sc.next();
        //管理员登录
        if(Pan.equals("是")){
            //管理员账号密码对比
            boolean Zhang = userpwd.equals(AdSgin.get(username));
            if(Zhang){
                System.out.println("登录成功!");
                //管理员登录返回1
                return 1;
            }
            else{
                System.out.println("账号或密码错误，重新尝试");
                //登录失败返回3
                return 3;
            }
        }
        else if(Pan.equals("否")){
            //用户账号密码对比
            boolean Zhang = userpwd.equals(UseSgin.get(username));
            if(Zhang){
                System.out.println("登陆成功!");
                //用户登录返回2
                return 2;
            }
            else{
                System.out.println("账号或密码错误，重新尝试");
                //登录失败返回3
                return 3;
            }
        }
        else {
            System.out.println("输入错误！");
            //登录失败返回3
            return 3;
        }
    }
}
