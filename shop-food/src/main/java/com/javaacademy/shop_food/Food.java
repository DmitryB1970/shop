package com.javaacademy.shop_food;


import com.javaacademy.shop_common.Product;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;


@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Food extends Product {

    @NonNull
    private Integer calorie;

//    public Food(@NonNull BigDecimal price, @NonNull String name, Integer calorie) {
//        super(price, name);
//        this.calorie = calorie;
//    }


}
