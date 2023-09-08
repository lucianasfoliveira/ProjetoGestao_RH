package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.City;
import br.com.taking.ProjetoGestaoRH.service.CityService;

@RestController
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@RequestMapping(value= "/city", method = RequestMethod.GET)
	public ResponseEntity<List<City>> GetALL(){
		
		List<City> resultado = cityService.listarTodos();
		return new ResponseEntity<List<City>> (resultado, HttpStatus.OK);
		
	}

}
