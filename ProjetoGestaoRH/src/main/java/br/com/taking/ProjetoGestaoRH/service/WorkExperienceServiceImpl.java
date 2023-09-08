package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.WorkExperience;
import br.com.taking.ProjetoGestaoRH.repository.WorkExperienceRepository;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService{
	
	
	@Autowired
	WorkExperienceRepository workexperienceRepository;
	

	@Override
	public List<WorkExperience> listarTodos() {
	
		return workexperienceRepository.findAll();
	}


	@Override
	public WorkExperience obterPorId(int id) {
		Optional<WorkExperience> result = workexperienceRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
			}else {
				return null;
			}
	}
	


}
