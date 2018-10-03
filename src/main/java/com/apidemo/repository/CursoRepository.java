package com.apidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apidemo.model.Curso;

public interface CursoRepository extends JpaRepository <Curso, int> {

}
