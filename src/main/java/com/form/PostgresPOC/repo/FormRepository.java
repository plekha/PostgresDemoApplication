package com.form.PostgresPOC.repo;

import com.form.PostgresPOC.model.Form;
import org.springframework.data.repository.CrudRepository;

public interface FormRepository extends CrudRepository<Form,Long> {
}
