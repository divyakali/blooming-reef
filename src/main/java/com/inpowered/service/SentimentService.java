package com.inpowered.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;

import com.aylien.textapi.TextAPIClient;
import com.aylien.textapi.TextAPIException;
import com.aylien.textapi.parameters.SentimentParams;
import com.inpowered.model.BloomingReefSentiment;
import com.inpowered.model.SentimentRepository;
import com.inpowered.model.SentimentRequest;

public class SentimentService {
	private static String APP_ID = "8ea112f4";
	private static String APP_KEY = "b395ca5bebc19ca919fbb0b93bd2bf0c";
	TextAPIClient client = new TextAPIClient(APP_ID, APP_KEY);

	@Inject
	private SentimentRepository repo;

	public BloomingReefSentiment getSentiment(String url) {

		System.out.println("Repo has records: " + repo.count());
		System.out.println("Get sentiment from database for url " + url);
		BloomingReefSentiment sentiment = null;
		SentimentRequest request = new SentimentRequest();
		try {
			request.setUrl(new URL(url));
			sentiment = analyze(request);
		} catch (Exception e) {

			System.out.print("Could not process " + url);
		}
		return sentiment;
	}

	public BloomingReefSentiment analyze(SentimentRequest request)
			throws TextAPIException {

		SentimentParams.Builder builder = SentimentParams.newBuilder();

		BloomingReefSentiment sentiment = repo.findOneByUrl(request.getUrl()
				.toString());
		if (sentiment != null) {
			return sentiment;
		} else {
			builder.setUrl(request.getUrl());
			builder.setMode(request.getMode());
			builder.setText(request.getText());
			sentiment = new BloomingReefSentiment(client.sentiment(builder
					.build()));
			sentiment.setUrl(request.getUrl().toString());
			System.out.println("Saving to database" + sentiment);
			return repo.save(sentiment);
		}
	}

}
