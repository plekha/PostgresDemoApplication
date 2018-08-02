package com.form.PostgresPOC.controller;

import com.form.PostgresPOC.model.Form;
import com.form.PostgresPOC.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    FormService formService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getForms(){
        return ResponseEntity.ok(formService.getForms());
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getFormById(@PathVariable("id") Long id){
        return ResponseEntity.ok(formService.getById(id));
    }
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity create(@RequestBody Form form){
        //validation code here
        Form updateForm=  formService.create(form);
        return ResponseEntity.ok(updateForm);

    }

}
