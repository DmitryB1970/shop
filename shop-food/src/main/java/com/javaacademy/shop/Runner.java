package com.javaacademy.shop;

import com.javaacademy.shop.common.Cashier;
import com.javaacademy.shop.food.Food;
import lombok.extern.slf4j.Slf4j;

import static java.math.BigDecimal.valueOf;

@Slf4j
public class Runner {

    public static void main(String[] args) {

        Food apple = new Food(valueOf(100), "яблоко", 50);
        log.info("Создан товар {}", apple);
        Food pizza = new Food(valueOf(500), "пицца", 549);
        log.info("Создан товар {}", pizza);
        Cashier cashier = new Cashier();
        cashier.addProduct(apple);
        cashier.addProduct(pizza);
        cashier.printProducts();
    }
}
