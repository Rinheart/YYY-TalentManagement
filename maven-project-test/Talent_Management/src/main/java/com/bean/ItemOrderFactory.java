package com.bean;

public class ItemOrderFactory {
    /*public static ItemOrder createItemOrder() {
        System.out.println("调用静态工厂方法创建 bean...");
        return new ItemOrder();
    }*/
    public ItemOrder createItemOrder() {
        System.out.println("调用实例工厂方法创建 bean...");
        return new ItemOrder();
    }
}
