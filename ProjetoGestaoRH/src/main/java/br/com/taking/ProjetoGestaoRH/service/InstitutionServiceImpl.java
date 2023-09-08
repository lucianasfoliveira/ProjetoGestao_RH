package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Institution;
import br.com.taking.ProjetoGestaoRH.repository.InstitutionRepository;

@Service
public class InstitutionServiceImpl implements InstitutionService{
	
	@Autowired
	InstitutionRepository institutionRepository;
	

	@Override
	public List<Institution> listarTodos() {
	
		return institutionRepository.findAll();
	}


}
