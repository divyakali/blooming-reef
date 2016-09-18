package com.inpowered.api.resource;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aylien.textapi.TextAPIException;
import com.inpowered.model.BloomingReefSentiment;
import com.inpowered.model.SentimentRequest;
import com.inpowered.service.SentimentService;

@RestController
@RequestMapping("/sentiment")
public class SentimentApi {
	@Inject
	SentimentService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<BloomingReefSentiment> analyseSentiment(@RequestBody SentimentRequest request) throws TextAPIException {
		return new ResponseEntity<BloomingReefSentiment>(service.analyze(request), HttpStatus.OK);
		

		
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<BloomingReefSentiment> getSentiment(@RequestParam("url") String url) {
		System.out.println(service.getSentiment(url));
		return new ResponseEntity<BloomingReefSentiment>(service.getSentiment(url), HttpStatus.OK);
		

		
	}

}
