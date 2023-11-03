package com.barney.factorypattern;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Hourly extends Employee{
    @Override
    public boolean isPayDay() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == 25;
    }

    @Override
    public BigDecimal calculateMoney() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public void deliverPay() {
        System.out.println("現金");
    }
}
