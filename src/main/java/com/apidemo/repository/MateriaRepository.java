package com.apidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apidemo.model.Materia;

public interface MateriaRepository extends JpaRepository <Materia, int> {

}
