package com.Order.test;

import java.time.LocalTime;

public class TakeOrdering {
    //订单信息（下单时间，菜品名称，数量，价格,客户名字）
    private String TName;
    private int TNumber;
    private int TPrice;
    private String TUserName;
    private LocalTime TTime;

    public TakeOrdering() {
    }

    public TakeOrdering(String TName, int TNumber, int TPrice, String TUserName, LocalTime TTime) {
        this.TName = TName;
        this.TNumber = TNumber;
        this.TPrice = TPrice;
        this.TUserName = TUserName;
        this.TTime = TTime;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public int getTNumber() {
        return TNumber;
    }

    public void setTNumber(int TNumber) {
        this.TNumber = TNumber;
    }

    public int getTPrice() {
        return TPrice;
    }

    public void setTPrice(int TPrice) {
        this.TPrice = TPrice;
    }

    public String getTUserName() {
        return TUserName;
    }

    public void setTUserName(String TUserName) {
        this.TUserName = TUserName;
    }

    public LocalTime getTTime() {
        return TTime;
    }

    public void setTTime(LocalTime TTime) {
        this.TTime = TTime;
    }

    @Override
    public String toString() {
        return "TakeOrdering{" +
                "TName='" + TName + '\'' +
                ", TNumber=" + TNumber +
                ", TPrice=" + TPrice +
                ", TUserName='" + TUserName + '\'' +
                ", TTime=" + TTime +
                '}';
    }
}




