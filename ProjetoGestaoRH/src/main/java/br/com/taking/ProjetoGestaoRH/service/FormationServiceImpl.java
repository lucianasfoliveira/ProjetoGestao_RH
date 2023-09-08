package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Formation;
import br.com.taking.ProjetoGestaoRH.repository.FormationRepository;

@Service
public class FormationServiceImpl implements FormationService{
	
	@Autowired
	FormationRepository formationRepository;
	

	@Override
	public List<Formation> listarTodos() {
	
		return formationRepository.findAll();
	}

}
