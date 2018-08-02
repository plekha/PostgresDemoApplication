package com.form.PostgresPOC.service;

import com.form.PostgresPOC.model.Form;

import java.util.List;

public interface FormService {
    public Form create(Form form);
    public Form update(Form form,Long id);
    public List<Form> getForms();
    public Form getById(Long id);
}
