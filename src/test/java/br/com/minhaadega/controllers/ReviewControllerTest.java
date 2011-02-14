package br.com.minhaadega.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ReviewControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ReviewController(null, null, null));
 	}
}
