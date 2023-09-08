package br.com.taking.ProjetoGestaoRH.service;


import java.util.List;


import br.com.taking.ProjetoGestaoRH.model.Candidato;


public interface CandidatoService {

	List<Candidato> listarTodos();
	
	Candidato obterPorId(int id);
	
	List<Candidato> findByIdentificationDocument(String identification);
	
	List<Candidato> obterPorGender(int gender);
	
	List<Candidato> obterPorAreaInterest(int areaInterest);
	
	List<Candidato> filtrar(
			String identificationDocument,
			int gender_id,
			String areaInterest ,
			String activitiesPerformed,
			String courseName,
			String roleName,
			int academicQualification_id);
			
	
}