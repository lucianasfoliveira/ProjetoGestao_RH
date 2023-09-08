package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Country;
import br.com.taking.ProjetoGestaoRH.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	CountryRepository countryRepository;
	

	@Override
	public List<Country> listarTodos() {
	
		return countryRepository.findAll();
	}

}
