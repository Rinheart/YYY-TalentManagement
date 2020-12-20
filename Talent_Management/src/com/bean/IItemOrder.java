package com.bean;

public interface IItemOrder {
    void incrementNumItems();
    void cancelOrder();
    double getTotalCost();

    double getUnitCost();

    IItem getItem();

    void setItem(IItem item);

    int getNumItems();

    void setNumItems(int numItems);

}
