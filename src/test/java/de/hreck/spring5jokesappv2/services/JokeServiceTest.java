package de.hreck.spring5jokesappv2.services;

import org.junit.jupiter.api.Test;

class JokeServiceTest {
	
	private static JokeService jokeService = new JokeServiceImpl();

	

	@Test
	void test() {
		System.out.println(jokeService.getJoke());
	}

}
