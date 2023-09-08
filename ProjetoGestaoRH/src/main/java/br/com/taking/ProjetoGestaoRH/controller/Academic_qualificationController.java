package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Academic_qualification;
import br.com.taking.ProjetoGestaoRH.service.Academic_qualificationService;

@RestController
public class Academic_qualificationController {
	
	@Autowired
	Academic_qualificationService academic_qualificationService;
	
	@RequestMapping(value= "/academic_qualification", method = RequestMethod.GET)
	public ResponseEntity<List<Academic_qualification>> GetALL(){
		
		List<Academic_qualification> resultado = academic_qualificationService.listarTodos();
		return new ResponseEntity<List<Academic_qualification>> (resultado, HttpStatus.OK);
		
	}

}
