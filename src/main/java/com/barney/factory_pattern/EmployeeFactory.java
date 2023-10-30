package com.barney.factory_pattern;

import com.barney.pojo.EmployeeType;

public interface EmployeeFactory {
    public Employee buildEmployee(EmployeeType employeeType);
}
