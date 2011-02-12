package br.com.minhaadega.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VinhoRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new VinhoRepositoryImpl(null));
  	}
}