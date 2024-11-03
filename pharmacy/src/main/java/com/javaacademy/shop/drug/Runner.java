package com.javaacademy.shop.drug;

import com.javaacademy.shop.common.Cashier;
import com.javaacademy.shop.drug.drug.Drug;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Runner {

    public static void main(String[] args) {

        Drug paracetamol = new Drug(BigDecimal.valueOf(250), "paracetamol", false);
        log.info("Создано новое лекарство {}", paracetamol);

        Cashier cashier = new Cashier();
        cashier.addProduct(paracetamol);
        cashier.printProducts();
    }
}
