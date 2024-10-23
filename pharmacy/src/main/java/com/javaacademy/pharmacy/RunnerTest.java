package com.javaacademy.pharmacy;

import com.javaacademy.shop_common.BoxOffice;
import com.javaacademy.shop_common.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;


public class RunnerTest {

    private static Logger logger= LoggerFactory.getLogger(RunnerTest.class);

    public static void main(String[] args) {
        logger.info("Создание лоротадина");

        Product loratadin = Drug.builder()
                .name("лоратадин")
                .isPrescription(true)
                .price(BigDecimal.valueOf(500))
                .build();

        BoxOffice boxOffice = new BoxOffice();
        boxOffice.addProduct(loratadin);
        boxOffice.printListOfProducts();
    }
}
