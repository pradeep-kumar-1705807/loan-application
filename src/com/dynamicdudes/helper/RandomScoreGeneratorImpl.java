package com.dynamicdudes.helper;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomScoreGeneratorImpl implements RandomScoreGenerator {

	@Override
	public int getRandomScore() {
		
	    Random random = new Random();
	    return random.nextInt(900 - 300) + 300;
	    
	}

	
}
