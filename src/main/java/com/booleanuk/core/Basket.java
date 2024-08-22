package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        this.products.add(product);
    }



    public int getTotal() {
        int total = 0;

        for (Product product : this.products) {
            total += product.getPrice();
        }
        return total;
    }

    public boolean isInBasket(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
