package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.State;
import br.com.taking.ProjetoGestaoRH.repository.StateRepository;

@Service
public class StateServiceimpl implements StateService{
	
	@Autowired
	StateRepository stateRepository;
	

	@Override
	public List<State> listarTodos() {
	
		return stateRepository.findAll();
	}

}
