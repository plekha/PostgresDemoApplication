package com.form.PostgresPOC.repo;

import com.form.PostgresPOC.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
