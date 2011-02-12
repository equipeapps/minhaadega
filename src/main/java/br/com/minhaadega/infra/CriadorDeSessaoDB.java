package br.com.minhaadega.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.minhaadega.models.Usuario;
import br.com.minhaadega.models.Vinho;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

@Component
public class CriadorDeSessaoDB implements ComponentFactory<Objectify> {

	private Objectify session;
	
	static {
		ObjectifyService.register(Vinho.class);
		ObjectifyService.register(Usuario.class);
	}
	
	@PostConstruct
	public void abreSession() {
		session = ObjectifyService.begin();
	}
	
	@PreDestroy
	public void fechaSession() {
		try {
		    session.getTxn().commit();
		} finally {
		    if (session.getTxn().isActive())
		    	session.getTxn().rollback();
		}
	}
	
	@Override
	public Objectify getInstance() {
		return session;
	}
}