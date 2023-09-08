package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Disability_type;
import br.com.taking.ProjetoGestaoRH.repository.Disability_typeRepository;

@Service
public class Disability_typeServiceImpl implements Disability_typeService{
	
	@Autowired
	Disability_typeRepository disability_typeRepository;
	

	@Override
	public List<Disability_type> listarTodos() {
	
		return disability_typeRepository.findAll();
	}

}
