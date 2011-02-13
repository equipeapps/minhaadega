package br.com.minhaadega.repositories;

import static org.junit.Assert.assertNotNull;
import junit.framework.Assert;

import org.junit.Test;

import br.com.minhaadega.models.Vinho;

import com.googlecode.objectify.Objectify;

public class VinhoRepositoryImplTest extends TestBase {

	@Test public void fakeTest() {
  		assertNotNull("put something real.", new VinhoRepositoryImpl(null));
  	}
	
	@Test public void adicionaVinhoTest() {
		Objectify fy = fact.begin();
		VinhoRepositoryImpl vinhoRepo = new VinhoRepositoryImpl(fy);
		
		Vinho vinho = new Vinho();
		vinho.setCodigoDeBarras("1");

		vinhoRepo.create(vinho);
		
		Vinho v = vinhoRepo.find(vinho.getId());
		
		Assert.assertEquals("1", v.getCodigoDeBarras());
  	}
}