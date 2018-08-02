package com.form.PostgresPOC.serviceimpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.form.PostgresPOC.model.Form;
import com.form.PostgresPOC.repo.FormRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FormServiceImplTest {


    @Autowired
    FormServiceImpl formService;
    @Autowired
    FormRepository formRepository;


    private Form form;
    private Form resultForm;
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        form = new Form();
        objectMapper = new ObjectMapper();
        form.setId(123L);
        form.setTenantId(12L);
        System.out.println("Employee object before Test" + form);
    }

    @Test
    public void create()
            throws Exception {

       // given(formRepository.save(form)).willReturn(form);
        //assertEquals(java.util.Optional.ofNullable(form.getId()),123);
    //  formService.create(form);
        System.out.println("Employee object While Test" + form);


    }
}