package com.i9.postgresdemo.serviceimpl;

import com.i9.postgresdemo.model.Employee;
import com.i9.postgresdemo.repo.EmployeeRepository;
import com.i9.postgresdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;


    @Override
    public  List<Employee> listAll(){
        List<Employee> employeeList = new ArrayList<>();
        repository.findAll().forEach(employeeList::add);
        return employeeList;
    }


    @Override
    public Employee getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }


    @Override
    public Employee saveOrUpdate(Employee employee) {
        repository.save(employee);
        System.out.println("Saved employee Id: " + employee.getId());
        return employee;
    }

}
