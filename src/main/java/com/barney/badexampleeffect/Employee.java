package com.barney.badexampleeffect;

import com.barney.pojo.EmployeeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private EmployeeType employeeType;
}
