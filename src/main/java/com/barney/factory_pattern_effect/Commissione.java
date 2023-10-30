package com.barney.factory_pattern_effect;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Commissione extends Employee {
    @Override
    public boolean isPayDay() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == 5;
    }

    @Override
    public BigDecimal calculateMoney() {
        return BigDecimal.valueOf(10000);
    }

    @Override
    public void deliverPay() {
        System.out.println("支票");
    }
}
