package com.i9.postgresdemo.repo;

import com.i9.postgresdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
