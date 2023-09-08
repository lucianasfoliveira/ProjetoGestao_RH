package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Country_Origin;
import br.com.taking.ProjetoGestaoRH.repository.Country_OriginRepository;

@Service
public class Country_OriginServiceImpl implements Country_OriginService{
	
	@Autowired
	Country_OriginRepository country_originRepository;
	

	@Override
	public List<Country_Origin> listarTodos() {
	
		return country_originRepository.findAll();
	}
}
