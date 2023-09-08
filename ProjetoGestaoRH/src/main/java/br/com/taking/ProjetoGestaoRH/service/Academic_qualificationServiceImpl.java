package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Academic_qualification;
import br.com.taking.ProjetoGestaoRH.repository.Academic_qualificationRepository;

@Service
public class Academic_qualificationServiceImpl implements Academic_qualificationService{

	@Autowired
	Academic_qualificationRepository academic_qualificationRepository;
	

	@Override
	public List<Academic_qualification> listarTodos() {
	
		return academic_qualificationRepository.findAll();
	}
}
