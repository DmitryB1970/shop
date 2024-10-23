package com.javaacademy.shop_food;

import com.javaacademy.shop_common.BoxOffice;
import com.javaacademy.shop_common.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;


public class Runner {

    public static Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        logger.trace("Создание яблока");
        Product apple = Food.builder()
                .name("яблоко")
                .price(BigDecimal.valueOf(100))
                .calorie(50)
                .build();

        logger.trace("Создание пиццы");
        Product pizza = Food.builder()
                .name("пицца")
                .price(BigDecimal.valueOf(500))
                .calorie(549)
                .build();


        BoxOffice boxOffice = new BoxOffice();
        boxOffice.addProduct(apple);
        boxOffice.addProduct(pizza);
        boxOffice.printListOfProducts();
    }
}
