package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import br.com.taking.ProjetoGestaoRH.model.Role;

public interface RoleService {
	
	List<Role> listarTodos();

	Role obterPorId(int id);
	
/*
	//OBTER POR ROLE
	Role obterPorRole_id(int role_id);
*/
}
