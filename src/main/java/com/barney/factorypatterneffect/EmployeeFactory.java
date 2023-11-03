package com.barney.factorypatterneffect;

import com.barney.pojo.EmployeeType;

public interface EmployeeFactory {
    public Employee buildEmployee(EmployeeType employeeType);
}
