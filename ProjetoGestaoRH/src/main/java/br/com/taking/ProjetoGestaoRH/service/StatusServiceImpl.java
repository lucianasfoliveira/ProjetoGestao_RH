package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Status;
import br.com.taking.ProjetoGestaoRH.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService{
	
	@Autowired
	StatusRepository statusRepository;
	

	@Override
	public List<Status> listarTodos() {
	
		return statusRepository.findAll();
	}

}
