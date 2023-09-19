package com.Order.test;

public class Admin extends Person{
    //创建管理类
    //创建管理标识符
    private static int AdminId = 123;


    public static int getAdminId() {
        return AdminId;
    }

    public static void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public Admin() {
    }

    public Admin(String username, String userpassword) {
        super(username, userpassword);
    }




}
