package com.apidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apidemo.model.Profesor;

public interface ProfesorRepository extends JpaRepository <Profesor, int> {

}
