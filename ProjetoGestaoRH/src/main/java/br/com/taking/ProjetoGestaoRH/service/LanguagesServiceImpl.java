package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Languages;
import br.com.taking.ProjetoGestaoRH.repository.LanguagesRepository;

@Service
public class LanguagesServiceImpl implements LanguagesService{
	
	@Autowired
	LanguagesRepository languagesRepository;
	

	@Override
	public List<Languages> listarTodos() {
	
		return languagesRepository.findAll();
	}

}
