package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Course;
import br.com.taking.ProjetoGestaoRH.repository.CourseRepository;

@Service
public class CourserServiceImpl implements CourseService{
	
	@Autowired
	CourseRepository courseRepository;
	

	@Override
	public List<Course> listarTodos() {
	
		return courseRepository.findAll();
	}

}
