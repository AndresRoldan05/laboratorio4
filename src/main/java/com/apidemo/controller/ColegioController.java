package com.apidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidemo.model.Alumno;
import com.apidemo.model.Curso;
import com.apidemo.model.Materia;
import com.apidemo.model.Profesor;
import com.apidemo.service.ColegioService;

@RestController
@RequestMapping("/colegio")
public class ColegioController {
	
	@Autowired
	private ColegioService colegioservice;
	
	@RequestMapping("profesores")
	public List<Profesor>getProfes(){
		return colegioservice.getProfes();
	}
	
	@RequestMapping("consultarProfesor")
	public Profesor getProfe(int id) {
		return colegioservice.getprofe(id);
	}
	
	@RequestMapping("buscarProfesor")
	public Profesor buscarProfe(int id) {
		return colegioservice.buscarProfe(id);
	}
	
	@RequestMapping("actualizarProfesor")
	public Profesor updateProfesor(Profesor profe) {
		return colegioservice.updateProfesor(profe);
	}
	
	@RequestMapping("crearProfesor")
	public Profesor addProfesor(Profesor profe) {
		return colegioservice.addProfesor(profe);
	}
	
	@RequestMapping("eliminarProfesor")
	public void eliminarProfesor(Profesor profe) {
		colegioservice.eliminarprofe(profe);
	}
	
	//////////////////////////////////////////////////
	
	@RequestMapping("alumnos")
	public List<Alumno>getAlumnos(){
		return colegioservice.getAlumnos();
	}
	
	@RequestMapping("consultarAlumno")
	public Alumno getAlumno(int id) {
		return colegioservice.getAlumno(id);
	}
	
	@RequestMapping("buscarAlumno")
	public Alumno buscarAlumno(int id) {
		return colegioservice.buscarAlumno(id);
	}
	
	@RequestMapping("actualizarAlumno")
	public Alumno updateAlumno(Alumno alumno) {
		return colegioservice.updateAlumno(alumno);
	}
	
	@RequestMapping("crearAlumno")
	public Alumno addProfesor(Alumno alumno) {
		return colegioservice.addAlumno(alumno);
	}
	
	@RequestMapping("eliminarAlumno")
	public void eliminarAlumno(Alumno alumno) {
		colegioservice.eliminarAlumno(alumno);
	}
	
	////////////////////////////////////////////////////
	
	@RequestMapping("cursos")
	public List<Curso>getCursos(){
		return colegioservice.getCursos();
	}
	
	@RequestMapping("consultarCurso")
	public Curso getCurso(int id) {
		return colegioservice.getCurso(id);
	}
	
	@RequestMapping("buscarCurso")
	public Curso buscarCurso(int id) {
		return colegioservice.buscarCurso(id);
	}
	
	@RequestMapping("actualizarCurso")
	public Curso updateCurso(Curso curso) {
		return colegioservice.updateCurso(curso);
	}
	
	@RequestMapping("crearCurso")
	public Curso addCurso(Curso curso) {
		return colegioservice.addCurso(curso);
	}
	
	@RequestMapping("eliminarCurso")
	public void eliminarCurso(Curso curso) {
		colegioservice.eliminarCurso(curso);
	}
	
	/////////////////////////////////////////////////////
	
	@RequestMapping("materias")
	public List<Materia>getMaterias(){
		return colegioservice.getMaterias();
	}
	
	@RequestMapping("consultarMateria")
	public Materia getMateria(int id) {
		return colegioservice.getMateria(id);
	}
	
	@RequestMapping("buscarMateria")
	public Materia buscarMateria(int id) {
		return colegioservice.buscarMateria(id);
	}
	
	@RequestMapping("actualizarMateria")
	public Materia updateMateria(Materia materia) {
		return colegioservice.updateMateria(materia);
	}
	
	@RequestMapping("crearMateria")
	public Materia addMateria(Materia materia) {
		return colegioservice.addMateria(materia);
	}
	
	@RequestMapping("eliminarMateria")
	public void eliminarMateria(Materia materia) {
		colegioservice.eliminarMateria(materia);
	}

}
