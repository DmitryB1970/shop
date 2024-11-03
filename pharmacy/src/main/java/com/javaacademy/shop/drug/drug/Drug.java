package com.javaacademy.shop.drug.drug;

import com.javaacademy.shop.common.Product;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;


@ToString(callSuper = true)
@Getter
@Setter
public class Drug extends Product {

    @NonNull
    private Boolean isPrescription;


    public Drug(@NonNull BigDecimal price, @NonNull String name, @NonNull Boolean isPrescription) {
        super(price, name);
        this.isPrescription = isPrescription;
    }
}
