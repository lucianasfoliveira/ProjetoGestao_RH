package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Gender;
import br.com.taking.ProjetoGestaoRH.repository.GenderRepository;

@Service
public class GenderServiceImpl implements GenderService{
	
	@Autowired
	GenderRepository genderRepository;
	

	@Override
	public List<Gender> listarTodos() {
	
		return genderRepository.findAll();
	}
	


	

}
