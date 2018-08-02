package com.form.PostgresPOC.serviceimpl;

import com.form.PostgresPOC.model.Form;
import com.form.PostgresPOC.repo.FormRepository;
import com.form.PostgresPOC.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    private FormRepository formRepository;
    @Override
    public Form create(Form form) {
      Form updatedForm=formRepository.save(form);
        return updatedForm;
    }

    @Override
    public Form update(Form form, Long id) {
        Optional<Form> isForm=formRepository.findById(id);
        if(isForm.isPresent()){
           formRepository.save(form);
        }
        return form;
    }

    @Override
    public List<Form> getForms() {
        return (List<Form>) formRepository.findAll();
    }

    @Override
    public Form getById(Long id) {
        Optional<Form> isForm=formRepository.findById(id);
        if(isForm.isPresent()){
            return isForm.get();
        }
        return null;
    }
}
