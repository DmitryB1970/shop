package com.javaacademy.shop.food;

import com.javaacademy.shop.common.Product;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
public class Food extends Product {

    @NonNull
    private Integer calories;

    public Food(@NonNull BigDecimal price, @NonNull String name, @NonNull Integer calories) {
        super(price, name);
        this.calories = calories;
    }
}
