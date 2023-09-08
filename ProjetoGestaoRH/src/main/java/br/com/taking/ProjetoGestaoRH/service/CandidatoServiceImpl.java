package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.taking.ProjetoGestaoRH.model.Candidato;
import br.com.taking.ProjetoGestaoRH.repository.CandidatoRepository;


@Service
public class CandidatoServiceImpl implements CandidatoService{

	
	@Autowired
	CandidatoRepository candidatoRepository;
	
	 public CandidatoServiceImpl(CandidatoRepository candidatoRepository) {
	        this.candidatoRepository = candidatoRepository;
	    }

	
	@Override
	public List<Candidato> listarTodos() {
		return candidatoRepository.findAll();
		
	}
	
	@Override
	public Candidato obterPorId(int id) {
		
		Optional<Candidato> result = candidatoRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
			}else {
				return null;
			}
	}
	
	@Override
	public List<Candidato> findByIdentificationDocument(String identification) {
		if(identification != null) {
			return candidatoRepository.findAll(identification);
			}else {
				return null;
			}
	}
	
	@Override
	public List<Candidato> obterPorGender(int gender) {			
		return candidatoRepository.findByGender(gender);
	}
			
	@Override
	public List<Candidato> obterPorAreaInterest(int areaInterest) {
		return candidatoRepository.findByAreaInterest(areaInterest);

	}
	
	@Override
	public List<Candidato> filtrar(String identificationDocument,
			int gender_id, String areaInterest , String activitiesPerformed,
			String courseName, String roleName, int academicQualification_id){
		

			
		return candidatoRepository.filter(identificationDocument,
				gender_id, areaInterest, activitiesPerformed, courseName,
				roleName, academicQualification_id);
	}
}

