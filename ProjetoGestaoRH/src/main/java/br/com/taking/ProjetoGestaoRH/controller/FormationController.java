package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Formation;
import br.com.taking.ProjetoGestaoRH.service.FormationService;

@RestController
public class FormationController {
	
	@Autowired
	FormationService formationService;
	
	@RequestMapping(value= "/formation", method = RequestMethod.GET)
	public ResponseEntity<List<Formation>> GetALL(){
		
		List<Formation> resultado = formationService.listarTodos();
		return new ResponseEntity<List<Formation>> (resultado, HttpStatus.OK);
		
	}

}
