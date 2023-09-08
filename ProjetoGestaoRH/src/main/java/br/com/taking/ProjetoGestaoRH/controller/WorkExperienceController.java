package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.WorkExperience;
import br.com.taking.ProjetoGestaoRH.service.WorkExperienceService;

@RestController
public class WorkExperienceController {
	
	@Autowired
	WorkExperienceService workexperienceService;
	
	@RequestMapping(value= "/workexperience", method = RequestMethod.GET)
	public ResponseEntity<List<WorkExperience>> GetALL(){
		
		List<WorkExperience> resultado = workexperienceService.listarTodos();
		return new ResponseEntity<List<WorkExperience>> (resultado, HttpStatus.OK);
		
	}

	

}
