package com.barney.factory_pattern_effect;

import com.barney.pojo.EmployeeType;

public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public Employee buildEmployee(EmployeeType employeeType) {
        switch (employeeType) {
            case COMMISSIONE :
                return new Commissione();
            case SALARIED:
                return new Salaried();
            case HOURLY:
                return new Hourly();
            case NEW_EMPLOYEE:
                return new NewEmployee();
            default:
                return null;
        }
    }
}
