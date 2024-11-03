package com.javaacademy.shop.common;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class Product {

    @NonNull
    private BigDecimal price;
    @NonNull
    private String name;

}
