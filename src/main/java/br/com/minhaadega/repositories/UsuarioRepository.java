package br.com.minhaadega.repositories;

import java.util.List;

import br.com.minhaadega.models.Usuario;

public interface UsuarioRepository {
	 
	void create(Usuario entity);
	
	void update(Usuario entity);
	
	void destroy(Usuario entity);
	
	Usuario find(Long id);
	
	List<Usuario> findAll();

}
