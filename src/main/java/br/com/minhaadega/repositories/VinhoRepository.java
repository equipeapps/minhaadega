package br.com.minhaadega.repositories;

import java.util.List;

import br.com.minhaadega.models.Vinho;

public interface VinhoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Vinho entity);
	
	void update(Vinho entity);
	
	void destroy(Vinho entity);
	
	Vinho find(Long id);
	
	List<Vinho> findAll();

}
