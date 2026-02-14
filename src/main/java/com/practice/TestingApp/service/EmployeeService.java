package com.practice.TestingApp.service;

import com.practice.TestingApp.dto.EmployeeDto;
import com.practice.TestingApp.repository.EmployeeRepository;

public interface EmployeeService {

    EmployeeDto getEmployeeById(Long id);
    EmployeeDto createNewEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
    void deleteEmployee(Long id);

}
