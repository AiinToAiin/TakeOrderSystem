package com.Order.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Adchage {
    public boolean Adchages(List<Order> AllShop){
        Order od = new Order();
        //管理员执行操作
        switch (Adminmenu()){
            //1.查看商品信息
            case 1: ShopMenu(AllShop);return true;
            //2.修改商品价格，数量，名称
            case 2:AllShop.add(AddMenu(AllShop));return true;
            case 3:return false;
            default:return false;
        }
    }


    //展示当前菜单
    public void ShopMenu(List<Order> NewList){
        Order od = new Order();
        System.out.println("---------目前商品----------");
        //将列表中的对象遍历，展示所有商品
        for (int i = 0; i < NewList.size(); i++) {
            //获取到列表中的对象，通过get方式获取信息并打印
            od = NewList.get(i);
            System.out.println("商品名称:"+od.getOName()+"\n商品价格:"+od.getOPrice()+"\n商品剩余"+od.getORemainingQuantity());
        }
    }

    //添加菜单
    public Order AddMenu(List<Order> NewList){
        Order od = new Order();
        Scanner sc = new Scanner(System.in);
        //键盘获取菜品信息，更新信息
        System.out.println("请输入添加的菜品名称：");
        String Name = sc.next();
        od.setOName(Name);
        System.out.println("请输入添加的菜品价格：");
        int peace = sc.nextInt();
        od.setOPrice(peace);
        System.out.println("请输入添加的菜品数量：");
        int number = sc.nextInt();
        od.setOSales(number);
        System.out.println("添加成功！");
        //返回对象信息，将对象添加到菜单所在的列表中
        return od;
    }
    //创建一个管理员展示的界面
    public int Adminmenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------管理员界面-----------");
        System.out.println("1.查看菜品信息");
        System.out.println("2.添加菜品");
        System.out.println("3.退出");
        int i = sc.nextInt();
        return i;
    }

}
