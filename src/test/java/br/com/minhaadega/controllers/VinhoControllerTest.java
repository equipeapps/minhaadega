package br.com.minhaadega.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VinhoControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new VinhoController(null, null, null));
 	}
}
