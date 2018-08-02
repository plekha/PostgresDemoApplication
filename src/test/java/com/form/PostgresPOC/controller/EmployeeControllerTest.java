package com.form.PostgresPOC.controller;

import com.form.PostgresPOC.repo.EmployeeRepository;
import com.form.PostgresPOC.model.Employee;
import com.form.PostgresPOC.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(controllers = EmployeeController.class)
//@ContextConfiguration(classes = PostgresDemoApplication.class)
public class EmployeeControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    EmployeeService employeeService;
    @MockBean
    EmployeeRepository employeeRepository;
    @Autowired
            ApplicationContext applicationContext;

    Employee emp;
//    @Autowired
//    ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        emp=new Employee();
        emp.setAddress("USA");

    }

    @Test
    public void getEmployees() {
    }

    @Test
    public void getEmployeeById() {
    }

    @Test
    public void create() {
    }
}