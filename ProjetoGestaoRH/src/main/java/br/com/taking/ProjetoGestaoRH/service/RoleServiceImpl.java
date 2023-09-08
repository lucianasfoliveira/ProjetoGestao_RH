package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Role;
import br.com.taking.ProjetoGestaoRH.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleRepository roleRepository;
	

	@Override
	public List<Role> listarTodos() {
		
		return roleRepository.findAll();
		}
	

	@Override
	public Role obterPorId(int id) {
		Optional<Role> result = roleRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
			}else {
				return null;
			}
	}
/*
	
	//OBTER POR ROLE
	@Override
	public Role obterPorRole_id(int role_id) {
		
		Optional<Role> result = roleRepository.GetByRoleId(role_id);
		if(result.isPresent()) {
			return result.get();
			}else {
				return null;
			}
	}

*/

	
	

}
