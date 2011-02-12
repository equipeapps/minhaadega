package br.com.minhaadega.repositories;

import br.com.caelum.vraptor.ioc.Component;
import br.com.minhaadega.models.Usuario;

import com.googlecode.objectify.Objectify;

@Component
public class UsuarioRepositoryImpl extends AbstractRepository<Usuario, Long> implements UsuarioRepository {

	public UsuarioRepositoryImpl(Objectify objectify) {
		super(objectify);
	}
}
