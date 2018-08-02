package com.form.PostgresPOC.controller;

import com.form.PostgresPOC.model.Employee;
import com.form.PostgresPOC.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getEmployees(){
        return ResponseEntity.ok(employeeService.listAll());
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getEmployeeById(@PathVariable("id") Long id){
        return ResponseEntity.ok(employeeService.getById(id));
    }
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity create(@RequestBody Employee employee){
        //validation code here
      Employee emp=  employeeService.saveOrUpdate(employee);
      return ResponseEntity.ok(emp);

    }

}
