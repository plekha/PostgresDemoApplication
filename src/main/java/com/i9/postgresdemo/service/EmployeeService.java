package com.i9.postgresdemo.service;


//serializer
import com.i9.postgresdemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listAll();

    Employee getById(Long id);

    Employee saveOrUpdate(Employee employee);

    void delete(Long id);


}
