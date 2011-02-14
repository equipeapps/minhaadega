package br.com.minhaadega.repositories;

import java.util.List;

import br.com.minhaadega.models.Review;

public interface ReviewRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Review entity);
	
	void update(Review entity);
	
	void destroy(Review entity);
	
	Review find(Long id);
	
	List<Review> findAll();

}
