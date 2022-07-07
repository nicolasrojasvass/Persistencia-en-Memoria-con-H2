package com.vass.springboot.PersistenciaEnMemoriaConH2.repository;

import com.vass.springboot.PersistenciaEnMemoriaConH2.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}