package com.barney.bad_example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bad {

    public BigDecimal calculateMoney(Employee employee) {
        switch (employee.getEmployeeType()) {
            case COMMISSIONE:
                return BigDecimal.valueOf(10000);
            case SALARIED:
                return BigDecimal.valueOf(1000);
            case HOURLY:
                return BigDecimal.valueOf(10);
            default:
                return BigDecimal.ZERO;
        }
    }

    public boolean isPayDay(Employee employee) {
        LocalDate today = LocalDate.now();

        switch (employee.getEmployeeType()) {
            case COMMISSIONE:
                return today.getDayOfMonth() == 5;
            case SALARIED:
                return today.getDayOfMonth() == 10;
            case HOURLY:
                return today.getDayOfMonth() == 25;
            default:
                return false;
        }
    }

    public void deliverPay(Employee employee) {
        switch (employee.getEmployeeType()) {
            case COMMISSIONE:
                System.out.println("支票");
            case SALARIED:
                System.out.println("轉帳");
            case HOURLY:
                System.out.println("現金");
            default:
                System.out.println("Barney的戶頭");
        }
    }
}
