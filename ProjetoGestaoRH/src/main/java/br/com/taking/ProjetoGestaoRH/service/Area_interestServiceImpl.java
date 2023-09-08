package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Area_interest;
import br.com.taking.ProjetoGestaoRH.repository.Area_interestRepository;

@Service
public class Area_interestServiceImpl implements Area_interestService{
	
	@Autowired
	Area_interestRepository area_interestRepository;
	

	@Override
	public List<Area_interest> listarTodos() {
	
		return area_interestRepository.findAll();
	}

}
