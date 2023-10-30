package com.barney.factory_pattern_effect;

import com.barney.pojo.EmployeeType;

public interface EmployeeFactory {
    public Employee buildEmployee(EmployeeType employeeType);
}
