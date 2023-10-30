package com.barney;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmployeeType {
    COMMISSIONE,
    HOURLY,
    SALARIED;
}
