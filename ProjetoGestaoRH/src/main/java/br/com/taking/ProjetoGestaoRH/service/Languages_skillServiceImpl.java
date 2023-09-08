package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Languages_skill;
import br.com.taking.ProjetoGestaoRH.repository.Languages_skillRepository;


@Service
public class Languages_skillServiceImpl implements Languages_skillService{
	
	@Autowired
	Languages_skillRepository languages_skillRepository;
	

	@Override
	public List<Languages_skill> listarTodos() {
	
		return languages_skillRepository.findAll();
	}

}
