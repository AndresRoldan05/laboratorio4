package com.apidemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apidemo.model.*;
import com.apidemo.repository.AlumnoRepository;
import com.apidemo.repository.CursoRepository;
import com.apidemo.repository.MateriaRepository;
import com.apidemo.repository.ProfesorRepository;
import com.apidemo.service.ColegioService;

@Service
public class ColegioServiceImpl implements ColegioService {
	
	private AlumnoRepository alumnoRepository;
	private CursoRepository cursoRepository;
	private MateriaRepository materiaRepository;
	private ProfesorRepository profesorRepository;
	
	@Override
	public List<Profesor> getProfes(){
		return profesorRepository.findAll();}
	@Override
	public Profesor getprofe(int id) {
		Profesor profe= profesorRepository.findById(String.valueOf(id));
		return profe.get();
	}
	
	@Override
	public Profesor buscarProfesor(int tem) {
		Profesor profe= profesorRepository.findById(tem);
		return profe.get();
	}
	
	@Override
	public Profesor updateProfesor(Profesor profe) {
		return profesorRepository.saveAndFlush(profe);
	}
	
	@Override
	public Profesor addProfesor(Profesor profe) {
		return profesorRepository.saveAndFlush(profe);
	}
	
	@Override
	public void eliminarProfesor(Profesor profe) {
		 profesorRepository.delete(profe);
	}
	
	////////////////////////////////////////////////////////////
	@Override
	public List<Alumno> getAlumnos(){
		return alumnoRepository.findAll();}
	
	@Override
	public Alumno getAlumno(int id) {
		Alumno alumno= alumnoRepository.findById(id);
		return alumno.get();
	}
	
	@Override
	public Alumno buscarAlumno(int tem) {
		Alumno alumno= alumnoRepository.findById(tem);
		return alumno.get();
	}
	
	@Override
	public Alumno updateAlumno(Alumno alumno) {
		return alumnoRepository.saveAndFlush(alumno);
	}
	
	@Override
	public Alumno addAlumno(Alumno alumno) {
		return alumnoRepository.saveAndFlush(alumno);
	}
	
	@Override
	public void eliminarAlumno(Alumno alumno) {
		 alumnoRepository.delete(alumno);
	}
	
	///////////////////////////////////////////////////////////
	@Override
	public List<Curso> getCursos(){
		return cursoRepository.findAll();}
	
	@Override
	public Curso getCurso(int id) {
		Curso curso= cursoRepository.findById(id);
		return curso.get();
	}
	
	@Override
	public Curso buscarCurso(int tem) {
		Curso curso= cursoRepository.findById(tem);
		return curso.get();
	}
	
	@Override
	public Curso updateCurso(Curso curso) {
		return cursoRepository.saveAndFlush(curso);
	}
	
	@Override
	public Curso addCurso(Curso curso) {
		return cursoRepository.saveAndFlush(curso);
	}
	
	@Override
	public void eliminarCurso(Curso curso) {
		 cursoRepository.delete(curso);
	}
	
	//////////////////////////////////////////////////////////
	@Override
	public List<Materia> getMaterias(){
		return materiaRepository.findAll();}
	
	@Override
	public Materia getMateria(int id) {
		Materia materia= materiaRepository.findById(id);
		return materia.get();
	}
	
	@Override
	public Materia buscarMateria(int tem) {
		Materia materia= materiaRepository.findById(tem);
		return materia.get();
	}
	
	@Override
	public Materia updateMateria(Materia materia) {
		return materiaRepository.saveAndFlush(materia);
	}
	
	@Override
	public Materia addMateria(Materia materia) {
		return materiaRepository.saveAndFlush(materia);
	}
	
	@Override
	public void eliminarMateria(Materia materia) {
		 materiaRepository.delete(materia);
	}

}
