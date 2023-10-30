package com.barney.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmployeeType {
    COMMISSIONE,
    HOURLY,
    SALARIED,
    NEW_EMPLOYEE
}
