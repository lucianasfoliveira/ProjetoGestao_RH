package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Level;
import br.com.taking.ProjetoGestaoRH.service.LevelService;

@RestController
public class LevelController {
	
	@Autowired
	LevelService levelService;
	
	@RequestMapping(value= "/level", method = RequestMethod.GET)
	public ResponseEntity<List<Level>> GetALL(){
		
		List<Level> resultado = levelService.listarTodos();
		return new ResponseEntity<List<Level>> (resultado, HttpStatus.OK);
		
	}

}
