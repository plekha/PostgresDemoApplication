package com.i9.postgresdemo.controller;


import com.i9.postgresdemo.avro.AvroSerializer;
import com.i9.postgresdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.i9.postgresdemo.serviceimpl.EmployeeServiceImpl;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/api")
public class INineController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @Autowired
    AvroSerializer avroSerializer;


    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String postCustomer(@Valid @RequestBody Employee employee, BindingResult bindingResult) throws IOException {
        System.out.print("saving data"+employee.getAddress());

        if(bindingResult.hasErrors()){
            return "employee/employeeCreate";
        }

        //avroSerializer.serialize(employee);
        Employee iNineForm1 = employeeServiceImpl.saveOrUpdate(employee);
        return "redirect:/api/employees/list";
    }

    @RequestMapping({"/employees","/employees/list"})
    public String  getEmployees(Model model) {
        model.addAttribute("employees", employeeServiceImpl.listAll());

        return "employee/list";

    }


    @RequestMapping(value = "/employee/delete/{id}")
    public String delete(@PathVariable String id){
        Employee e = employeeServiceImpl.getById(Long.valueOf(id));
        if(e!=null) {
            employeeServiceImpl.delete(Long.valueOf(id));
        }
        return "redirect:/api/employees/list";

    }

    @RequestMapping(value = "/employee/edit/{id}")
    public String edit(@PathVariable String id, Model model){

        Employee employee = employeeServiceImpl.getById(Long.valueOf(id));
        model.addAttribute("employeeForm", employee);
        return "employee/employeeEdit";
    }

    @RequestMapping("/employee/new")
    public String newProduct(Model model){
        model.addAttribute("employee", new Employee());
        return "employee/employeeCreate";
    }
}
