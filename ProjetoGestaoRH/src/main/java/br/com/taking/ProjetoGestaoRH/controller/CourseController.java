package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Course;
import br.com.taking.ProjetoGestaoRH.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value= "/course", method = RequestMethod.GET)
	public ResponseEntity<List<Course>> GetALL(){
		
		List<Course> resultado = courseService.listarTodos();
		return new ResponseEntity<List<Course>> (resultado, HttpStatus.OK);
		
	}

}
