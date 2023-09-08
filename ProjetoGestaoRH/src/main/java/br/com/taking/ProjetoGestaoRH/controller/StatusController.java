package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Status;
import br.com.taking.ProjetoGestaoRH.service.StatusService;

@RestController
public class StatusController {
	
	@Autowired
	StatusService statusService;
	
	@RequestMapping(value= "/status", method = RequestMethod.GET)
	public ResponseEntity<List<Status>> GetALL(){
		
		List<Status> resultado = statusService.listarTodos();
		return new ResponseEntity<List<Status>> (resultado, HttpStatus.OK);
		
	}

}
