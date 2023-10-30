package com.barney.factory_pattern_effect;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NewEmployee extends Employee{
    @Override
    public boolean isPayDay() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == 1;
    }

    @Override
    public BigDecimal calculateMoney() {
        return BigDecimal.valueOf(40);
    }

    @Override
    public void deliverPay() {
        System.out.println("楓幣");
    }
}
