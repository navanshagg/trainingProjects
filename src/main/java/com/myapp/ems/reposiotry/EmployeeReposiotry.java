package com.myapp.ems.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.myapp.ems.model.Employee;

@Repository("employeeReposiotry")
public interface EmployeeReposiotry extends  JpaRepository<Employee, Integer> {

}
