package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.State;
import br.com.taking.ProjetoGestaoRH.service.StateService;

@RestController
public class StateController {
	
	@Autowired
	StateService stateService;
	
	@RequestMapping(value= "/state", method = RequestMethod.GET)
	public ResponseEntity<List<State>> GetALL(){
		
		List<State> resultado = stateService.listarTodos();
		return new ResponseEntity<List<State>> (resultado, HttpStatus.OK);
		
	}

}
