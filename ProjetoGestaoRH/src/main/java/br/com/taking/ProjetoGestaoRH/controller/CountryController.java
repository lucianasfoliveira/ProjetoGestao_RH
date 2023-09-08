package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Country;
import br.com.taking.ProjetoGestaoRH.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@RequestMapping(value= "/country", method = RequestMethod.GET)
	public ResponseEntity<List<Country>> GetALL(){
		
		List<Country> resultado = countryService.listarTodos();
		return new ResponseEntity<List<Country>> (resultado, HttpStatus.OK);
		
	}

}
