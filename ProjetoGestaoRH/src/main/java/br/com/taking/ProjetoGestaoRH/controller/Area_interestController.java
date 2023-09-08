package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Area_interest;
import br.com.taking.ProjetoGestaoRH.service.Area_interestService;




@RestController
public class Area_interestController {
	
	@Autowired
	Area_interestService area_interestService;
	
	@RequestMapping(value= "/area_interest", method = RequestMethod.GET)
	public ResponseEntity<List<Area_interest>> GetALL(){
		
		List<Area_interest> resultado = area_interestService.listarTodos();
		return new ResponseEntity<List<Area_interest>> (resultado, HttpStatus.OK);
		
	}


}
