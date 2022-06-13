package com.parametapruebatecnica.parametapruebatecnica.repositories;

import com.parametapruebatecnica.parametapruebatecnica.models.EmpleadoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoModel, Long> {

}
