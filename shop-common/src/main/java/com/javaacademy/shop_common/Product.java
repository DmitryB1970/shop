package com.javaacademy.shop_common;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class Product {

    @NonNull
    private BigDecimal price;
    @NonNull
    private String name;

}
