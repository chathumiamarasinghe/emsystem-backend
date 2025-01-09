package net.javaguides.ems_backend.service;

import net.javaguides.ems_backend.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
