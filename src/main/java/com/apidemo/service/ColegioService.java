package com.apidemo.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import com.apidemo.model.*;


public interface ColegioService {
	
   public List<Profesor>getProfes();
   public Profesor getprofe();
   public Profesor buscarProfe(int id);
   public Profesor updateProfe(Profesor profe);
   public Profesor addprofesor(Profesor profe);
   public void eliminarprofe(Profesor profe);
	
	
	public List<Alumno>getAlumnos();
	public Alumno getAlumno();
    public Alumno buscarAlumno(int id);
	public Alumno updateAlumno(Alumno alumno);
	public Alumno addAlumno(Alumno alumno);
	public void eliminarAlumno(Alumno alumno);
	
	
	
	public List<Curso>getCursos();
	public Curso getCurso();
    public Curso buscarCurso(int id);
	public Curso updateCurso(Curso curso);
	public Curso addCurso(Curso curso);
	public void eliminarCurso(Curso curso);
	
	
	public List<Materia>getMaterias();
	public Materia getMateria();
    public Materia buscarMateria(int id);
	public Materia updateMateria(Materia materia);
	public Materia addMateria(Materia materia);
	public void eliminarMateria(Materia materia);
	
	

}
