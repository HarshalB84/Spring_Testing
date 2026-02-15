package com.practice.TestingApp.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindByEmail_whenEmailIsValid_thenReturnEmployee() {

    }

    @Test
    void testFindByEmail_whenEmailIsNotFound_thenReturnEmployeeList(){

    }
}