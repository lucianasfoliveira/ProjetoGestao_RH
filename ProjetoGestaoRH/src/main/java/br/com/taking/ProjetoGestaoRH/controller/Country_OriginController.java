package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Country_Origin;
import br.com.taking.ProjetoGestaoRH.service.Country_OriginService;

@RestController
public class Country_OriginController {
	
	@Autowired
	Country_OriginService country_originService;
	
	@RequestMapping(value= "/country_origin", method = RequestMethod.GET)
	public ResponseEntity<List<Country_Origin>> GetALL(){
		
		List<Country_Origin> resultado = country_originService.listarTodos();
		return new ResponseEntity<List<Country_Origin>> (resultado, HttpStatus.OK);
		
	}

}
