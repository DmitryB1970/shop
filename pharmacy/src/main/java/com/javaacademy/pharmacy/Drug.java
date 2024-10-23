package com.javaacademy.pharmacy;

import com.javaacademy.shop_common.Product;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
@Getter
@Setter
public class Drug extends Product {

    @NonNull
    private Boolean isPrescription;

}
