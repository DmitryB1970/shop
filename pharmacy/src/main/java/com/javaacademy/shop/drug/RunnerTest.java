package com.javaacademy.shop.drug;

import com.javaacademy.shop.common.Cashier;
import com.javaacademy.shop.drug.drug.Drug;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class RunnerTest {

    public static void main(String[] args) {

        Drug lorotadin = new Drug(BigDecimal.valueOf(500), "lorotadin", true);
        log.info("Создано новое лекарство {}", lorotadin);

        Cashier cashier = new Cashier();
        cashier.addProduct(lorotadin);
        cashier.printProducts();
    }
}
