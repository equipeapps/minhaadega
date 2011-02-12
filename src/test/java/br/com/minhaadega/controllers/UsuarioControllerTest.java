package br.com.minhaadega.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UsuarioControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new UsuarioController(null, null, null));
 	}
}
