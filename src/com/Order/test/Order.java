package com.Order.test;

public class Order {
    //菜单类（菜品名称，价格，销量，菜品类型，剩余数量）
    private String OName;
    private int OPrice;
    private int OSales;
    private String OType;
    private int ORemainingQuantity;

    public Order() {
    }

    public Order(String OName, int OPrice, int OSales, String OType, int ORemainingQuantity) {
        this.OName = OName;
        this.OPrice = OPrice;
        this.OSales = OSales;
        this.OType = OType;
        this.ORemainingQuantity = ORemainingQuantity;
    }

    public String getOName() {
        return OName;
    }

    public void setOName(String OName) {
        this.OName = OName;
    }

    public int getOPrice() {
        return OPrice;
    }

    public void setOPrice(int OPrice) {
        this.OPrice = OPrice;
    }

    public int getOSales() {
        return OSales;
    }

    public void setOSales(int OSales) {
        this.OSales = OSales;
    }

    public String getOType() {
        return OType;
    }

    public void setOType(String OType) {
        this.OType = OType;
    }

    public int getORemainingQuantity() {
        return ORemainingQuantity;
    }

    public void setORemainingQuantity(int ORemainingQuantity) {
        this.ORemainingQuantity = ORemainingQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OName='" + OName + '\'' +
                ", OPrice=" + OPrice +
                ", OSales=" + OSales +
                ", OType='" + OType + '\'' +
                ", ORemainingQuantity=" + ORemainingQuantity +
                '}';
    }
}
