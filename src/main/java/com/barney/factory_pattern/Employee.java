package com.barney.factory_pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Employee {
    public abstract boolean isPayDay();
    public abstract BigDecimal calculateMoney();
    public abstract void deliverPay();
}
