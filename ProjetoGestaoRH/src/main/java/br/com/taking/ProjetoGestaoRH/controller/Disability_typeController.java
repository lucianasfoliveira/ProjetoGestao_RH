package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Disability_type;
import br.com.taking.ProjetoGestaoRH.service.Disability_typeService;

@RestController
public class Disability_typeController {
	
	@Autowired
	Disability_typeService desability_typeService;
	
	@RequestMapping(value= "/desability_type", method = RequestMethod.GET)
	public ResponseEntity<List<Disability_type>> GetALL(){
		
		List<Disability_type> resultado = desability_typeService.listarTodos();
		return new ResponseEntity<List<Disability_type>> (resultado, HttpStatus.OK);
		
	}

}
