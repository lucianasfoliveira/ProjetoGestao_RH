package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Level;
import br.com.taking.ProjetoGestaoRH.repository.LevelRepository;

@Service
public class LevelServiceImpl implements LevelService{
	
	@Autowired
	LevelRepository levelRepository;
	

	@Override
	public List<Level> listarTodos() {
	
		return levelRepository.findAll();
	}


}
