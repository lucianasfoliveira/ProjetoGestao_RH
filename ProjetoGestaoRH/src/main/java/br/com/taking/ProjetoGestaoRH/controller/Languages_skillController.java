package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Languages_skill;
import br.com.taking.ProjetoGestaoRH.service.Languages_skillService;

@RestController
public class Languages_skillController {
	
	@Autowired
	Languages_skillService languages_skillService;
	
	@RequestMapping(value= "/languages_skill", method = RequestMethod.GET)
	public ResponseEntity<List<Languages_skill>> GetALL(){
		
		List<Languages_skill> resultado = languages_skillService.listarTodos();
		return new ResponseEntity<List<Languages_skill>> (resultado, HttpStatus.OK);
		
	}


}
