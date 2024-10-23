package com.javaacademy.shop_common;

import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void printListOfProducts () {
        System.out.println(productList);
    }
}
