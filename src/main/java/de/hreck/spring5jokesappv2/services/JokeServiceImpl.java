package de.hreck.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
	
		
	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}

}

