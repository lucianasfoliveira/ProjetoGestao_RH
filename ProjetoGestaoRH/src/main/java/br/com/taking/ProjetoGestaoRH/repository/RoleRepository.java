package br.com.taking.ProjetoGestaoRH.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.taking.ProjetoGestaoRH.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	/*
	//OBTER POR ROlE
	@Query("Select r "
			+ "From role r"
			+ "JOIN workexperience w" 
			+ "JOIN candidato c"
			+ "WHERE r.role_id = w.role_id "
			+ "AND w.role_id = c.role_id"
			+ "AND r.role_id = :role_id ")
	Optional<Role> GetByRoleId(@Param("role_id")int role_id);
	
	*/


}
