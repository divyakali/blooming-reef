package com.inpowered;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.inpowered.model.PersonRepository;
import com.inpowered.model.SentimentRepository;
import com.inpowered.service.PersonService;
import com.inpowered.service.PersonServiceImpl;
import com.inpowered.service.SentimentService;

/**
 * Initialize all services here
 * 
 * @author aethena
 *
 */
@Configuration
@EntityScan
public class DataServiceConfiguration {
	
	@Autowired
	private SentimentRepository sentimentRepo;
	
	@Bean
	public SentimentService sentimentService() {
		return new SentimentService();
	}

}
