package br.com.minhaadega.controllers;

import java.util.List;

import br.com.minhaadega.models.Review;
import br.com.minhaadega.repositories.ReviewRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ReviewController {

	private final Result result;
	private final ReviewRepository repository;
	private final Validator validator;
	
	public ReviewController(Result result, ReviewRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Get
	@Path("/reviews")
	public List<Review> index() {
		return repository.findAll();
	}
	
	@Post
	@Path("/reviews")
	public void create(Review review) {
		validator.validate(review);
		validator.onErrorUsePageOf(this).newReview();
		repository.create(review);
		result.redirectTo(this).index();
	}
	
	@Get
	@Path("/reviews/new")
	public Review newReview() {
		return new Review();
	}
	
	@Put
	@Path("/reviews")
	public void update(Review review) {
		validator.validate(review);
		validator.onErrorUsePageOf(this).edit(review);
		repository.update(review);
		result.redirectTo(this).index();
	}
	
	@Get
	@Path("/reviews/{review.id}/edit")
	public Review edit(Review review) {
		return repository.find(review.getId());
	}

	@Get
	@Path("/reviews/{review.id}")
	public Review show(Review review) {
		return repository.find(review.getId());
	}

	@Delete
	@Path("/reviews/{review.id}")
	public void destroy(Review review) {
		repository.destroy(repository.find(review.getId()));
		result.redirectTo(this).index();  
	}
	
}
