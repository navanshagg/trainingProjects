package com.myapp.ems.service;

import java.util.List;

import com.myapp.ems.model.Employee;

public interface EmployeeService {
	Employee findEmployee(int employeId);
	boolean deleteEmployee(int employeeId);
	boolean updateEmployee(Employee employee);
	boolean addEmployee(Employee employee);
	List<Employee> findAllEmployees();
}
