package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder, InitializingBean, DisposableBean {
    private IItem item;
    private int numItems;

    public ItemOrder() {
        System.out.println("Spring 实例化 ItemOrder...");
    }

    public void incrementNumItems() {
        setNumItems(getNumItems() + 1);
    }
    public void cancelOrder() {
        setNumItems(0);
    }
    public double getTotalCost() {
        return (getNumItems() * getUnitCost());
    }

    public double getUnitCost(){
        return item.getCost();
    }

    public IItem getItem() {
        return item;
    }

    public void setItem(IItem item) {
        System.out.println("Spring 注入 item...");
        this.item = item;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        System.out.println("Spring 注入 numItems...");
        this.numItems = numItems;
    }

    @Override
    public String toString() {
        return "\nItemOrder{" +
                "item=" + item +
                ", \nnumItems=" + numItems +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行ItemOrder初始化方法 afterPropertiesSet");
    }

    private void init() {
        System.out.println("配置init-method属性，执行依赖关系注入之后的行为init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("正在执行ItemOrder销毁方法 销毁之前的行为destroy");
    }

    private void des_xml() {
        System.out.println("正在执行ItemOrder销毁方法 通过添加destroy-method属性");
    }
}
