package com.barney.factorypatterneffect;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Salaried extends Employee {
    @Override
    public boolean isPayDay() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == 10;
    }

    @Override
    public BigDecimal calculateMoney() {
        return BigDecimal.valueOf(1000);
    }

    @Override
    public void deliverPay() {
        System.out.println("轉帳");
    }
}
