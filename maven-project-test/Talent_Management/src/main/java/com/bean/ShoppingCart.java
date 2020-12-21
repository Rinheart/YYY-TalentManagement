package com.bean;

import java.util.*;

public class ShoppingCart {
    private List itemsOrdered;

    public List getItemsOrdered() {
        return (itemsOrdered);
    }

    public void setItemsOrdered(List itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    @Override
    public String toString() {
        return "ShoppingCart{\n" +
                "itemsOrdered=" + itemsOrdered +
                '}';
    }
}