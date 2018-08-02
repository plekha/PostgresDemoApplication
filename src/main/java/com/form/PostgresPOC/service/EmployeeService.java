package com.form.PostgresPOC.service;


//serializer
import com.form.PostgresPOC.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listAll();

    Employee getById(Long id);

    Employee saveOrUpdate(Employee employee);

    void delete(Long id);


}
