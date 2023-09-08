package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Languages;
import br.com.taking.ProjetoGestaoRH.service.LanguagesService;

@RestController
public class LanguagesController {
	
	@Autowired
	LanguagesService languagesService;
	
	@RequestMapping(value= "/languages", method = RequestMethod.GET)
	public ResponseEntity<List<Languages>> GetALL(){
		
		List<Languages> resultado = languagesService.listarTodos();
		return new ResponseEntity<List<Languages>> (resultado, HttpStatus.OK);
		
	}

}
