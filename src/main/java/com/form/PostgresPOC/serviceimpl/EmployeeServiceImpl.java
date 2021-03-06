package com.form.PostgresPOC.serviceimpl;

import com.form.PostgresPOC.model.Employee;
import com.form.PostgresPOC.repo.EmployeeRepository;
import com.form.PostgresPOC.service.EmployeeService;
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

       Employee updatedEmployee= repository.save(employee);
        //System.out.println("Saved employee Id: " + employee.getId());
        return updatedEmployee;
    }

}
