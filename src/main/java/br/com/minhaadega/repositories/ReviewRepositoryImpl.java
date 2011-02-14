package br.com.minhaadega.repositories;

import br.com.caelum.vraptor.ioc.Component;
import br.com.minhaadega.models.Review;

import com.googlecode.objectify.Objectify;

@Component
public class ReviewRepositoryImpl extends Repository<Review, Long> implements ReviewRepository {

	public ReviewRepositoryImpl(Objectify ofy) {
		super(ofy);
	}
}
