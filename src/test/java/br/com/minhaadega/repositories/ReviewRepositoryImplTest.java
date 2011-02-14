package br.com.minhaadega.repositories;

import static org.junit.Assert.assertNotNull;
import junit.framework.Assert;

import org.junit.Test;

import br.com.minhaadega.models.Review;
import br.com.minhaadega.models.Vinho;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;

public class ReviewRepositoryImplTest extends TestBase {

	@Test public void fakeTest() {
  		assertNotNull("put something real.", new ReviewRepositoryImpl(null));
  	}
	
	@Test public void deveAdicionarUmReview() {
		Objectify ofy = fact.begin();
		ReviewRepositoryImpl reviewRepo = new ReviewRepositoryImpl(ofy);
		
		Review review = new Review();
		review.setNota(6);
		review.setUsuario("Arthur");
		
		reviewRepo.create(review);
		
		Review reviewAdicionado = reviewRepo.find(review.getId());
		
		Assert.assertEquals("Arthur", reviewAdicionado.getUsuario());
		Assert.assertEquals(new Integer(6), reviewAdicionado.getNota());
  	}
	
	@Test public void deveAdicionarUmReviewComVinhoVinculado() {
		Objectify ofy = fact.begin();
		ReviewRepositoryImpl reviewRepo = new ReviewRepositoryImpl(ofy);
		
		Vinho vinhoCantinaDasTrevas = new Vinho();
		vinhoCantinaDasTrevas.setNome("Cantina das trevas");
		vinhoCantinaDasTrevas.setPrecoMedio(7.9f);
		
		VinhoRepositoryImpl vinhoRepo = new VinhoRepositoryImpl(ofy);
		vinhoRepo.create(vinhoCantinaDasTrevas);
		
		Review review = new Review();
		review.setNota(6);
		review.setUsuario("Arthur");
		review.setVinho(new Key<Vinho>(Vinho.class, vinhoCantinaDasTrevas.getId()));
		
		reviewRepo.create(review);
		
		Review reviewAdicionado = reviewRepo.find(review.getId());
		Vinho vinhoDoReview = vinhoRepo.find(reviewAdicionado.getVinho().getId());
		
		Assert.assertEquals("Arthur", reviewAdicionado.getUsuario());
		Assert.assertEquals(Integer.valueOf(6), reviewAdicionado.getNota());
		Assert.assertEquals("Cantina das trevas", vinhoDoReview.getNome());
  	}
}