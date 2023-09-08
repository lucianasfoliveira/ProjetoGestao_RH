package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import br.com.taking.ProjetoGestaoRH.model.WorkExperience;

public interface WorkExperienceService {

	List<WorkExperience> listarTodos();
	
	WorkExperience obterPorId(int id);


	
}
