package com.example.redis;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ProductDto {
    private String name;
    private String code;
    private BigDecimal sellPrice;


}
