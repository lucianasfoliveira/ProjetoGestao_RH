package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.City;
import br.com.taking.ProjetoGestaoRH.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	CityRepository cityRepository;
	

	@Override
	public List<City> listarTodos() {
	
		return cityRepository.findAll();
	}

}
