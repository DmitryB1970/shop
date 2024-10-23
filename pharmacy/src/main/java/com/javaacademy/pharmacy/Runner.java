package com.javaacademy.pharmacy;

import com.javaacademy.shop_common.BoxOffice;
import com.javaacademy.shop_common.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;


public class Runner {

    public static final Logger logger = LoggerFactory.getLogger(Runner.class);
    public static void main(String[] args) {

        logger.trace("Создание парацетамола");
        Product paracetamol = Drug.builder()
                .isPrescription(false)
                .price(BigDecimal.valueOf(250))
                .name("paracetamol")
                .build();

        BoxOffice boxOffice = new BoxOffice();
        boxOffice.addProduct(paracetamol);
        boxOffice.printListOfProducts();
    }
}
