package br.com.minhaadega.repositories;

import com.googlecode.objectify.Objectify;

import br.com.caelum.vraptor.ioc.Component;
import br.com.minhaadega.models.Vinho;

@Component
public class VinhoRepositoryImpl extends Repository<Vinho, Long> implements VinhoRepository {

	public VinhoRepositoryImpl(Objectify objectify) {
		super(objectify);
	}
}
