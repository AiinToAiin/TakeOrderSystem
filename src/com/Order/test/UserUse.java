package com.Order.test;
import com.Order.test.Adchage;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class UserUse {
    private Object LocalTime;

    public boolean Useruse(List<Order> list){
        //用户登录后首先看到的是商品界面
        Order od = new Order();
        Adchage adc = new Adchage();
        System.out.println("1.查看商品");
        System.out.println("2.下单商品");
        System.out.println("3.退出");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i){
            case 1:
                //查看商品
                adc.ShopMenu(list);
                return true;
            case 2:
                //下单
                //用户还能下单
                TakeOrder(list);
                return true;
            case 3:
                //退出
                return false;
            default:return false;
        }

    }
    //用户下单
    public List<Order> TakeOrder(List<Order> List){
        java.time.LocalTime time = java.time.LocalTime.now();
        Scanner sc = new Scanner(System.in);
        //根据菜品名称下单
        System.out.println("请输入您要下单的菜品：");
        String take = sc.next();
        //菜品信息在List列表中，需要list信息,获取到购买菜品信息时遍历列表查找菜品信息，提示当前数量，需要下单的数量
        for (int i = 0; i < List.size(); i++) {
            //判断菜品信息和菜单上的是否相同如果相同，提示当前存量和需要下单数量
            if(take.equals(List.get(i).getOName())){
                //提示存量和下单数量
                System.out.println("当前"+List.get(i).getOName()+"剩余:"+List.get(i).getOSales());
                System.out.println("请输入您要下单的数量：");
                int Peace = sc.nextInt();
                //如果总货物小于0，定义为0并提示
                int ORemainingQuantity = List.get(i).getORemainingQuantity()-Peace;
                if(ORemainingQuantity<0){
                    List.get(i).setORemainingQuantity(0);
                    System.out.println("抱歉，商品余额不足");
                    break;
                }
                else {
                    int select = 0;
                    //更新剩余货物数量
                    List.get(i).setORemainingQuantity(ORemainingQuantity);
                    //销量+1
                    List.get(i).setOSales(select++);
                    System.out.println("下单成功！");
                    System.out.println("下单商品为："+List.get(i).getOName()+"下单数量为："+Peace+"下单时间为："+ time);
                    return List;
                }
            }
            else{
                //仓库里没有这个菜品
            }
        }
        // 下单时需要询问菜品名称和数量，对应减少菜品的数量，当数量减少到0的时候提示告销,结束后需要返回新的列表信息
        System.out.println("没有此商品");
        return List;
    }

}
