package br.com.minhaadega.controllers;

import java.util.List;

import br.com.minhaadega.models.Vinho;
import br.com.minhaadega.repositories.VinhoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class VinhoController {

	private final Result result;
	private final VinhoRepository repository;
	private final Validator validator;
	
	public VinhoController(Result result, VinhoRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Get
	@Path("/vinhos")
	public List<Vinho> index() {
		return repository.findAll();
	}
	
	@Post
	@Path("/vinhos")
	public void create(Vinho vinho) {
//		validator.validate(vinho);
		validator.onErrorUsePageOf(this).newVinho();
		repository.create(vinho);
		result.redirectTo(this).index();
	}
	
	@Get
	@Path("/vinhos/new")
	public Vinho newVinho() {
		return new Vinho();
	}
	
	@Put
	@Path("/vinhos")
	public void update(Vinho vinho) {
//		validator.validate(vinho);
		validator.onErrorUsePageOf(this).edit(vinho);
		repository.update(vinho);
		result.redirectTo(this).index();
	}
	
	@Get
	@Path("/vinhos/{vinho.id}/edit")
	public Vinho edit(Vinho vinho) {
		return repository.find(vinho.getId());
	}

	@Get
	@Path("/vinhos/{vinho.id}")
	public Vinho show(Vinho vinho) {
		return repository.find(vinho.getId());
	}

	@Delete
	@Path("/vinhos/{vinho.id}")
	public void destroy(Vinho vinho) {
		repository.destroy(repository.find(vinho.getId()));
		result.redirectTo(this).index();  
	}
	
}
