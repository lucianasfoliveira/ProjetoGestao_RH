package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Institution;
import br.com.taking.ProjetoGestaoRH.service.InstitutionService;

@RestController
public class InstitutionController {
	
	@Autowired
	InstitutionService institutionService;
	
	@RequestMapping(value= "/institution", method = RequestMethod.GET)
	public ResponseEntity<List<Institution>> GetALL(){
		
		List<Institution> resultado = institutionService.listarTodos();
		return new ResponseEntity<List<Institution>> (resultado, HttpStatus.OK);
		
	}

}
