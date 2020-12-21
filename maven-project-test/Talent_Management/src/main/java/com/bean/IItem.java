package com.bean;

public interface IItem {

    String getItemID();

    void setItemID(String itemID);

    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String description);

    double getCost();

    void setCost(double cost);

    String toString();
}
