package com.inpowered;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aylien.textapi.TextAPIException;
import com.inpowered.model.BloomingReefSentiment;
import com.inpowered.model.SentimentRepository;
import com.inpowered.model.SentimentRequest;
import com.inpowered.service.SentimentService;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@ContextConfiguration(classes = { BloomingReefSentimentAnalysisTest.class })
public class BloomingReefSentimentAnalysisTest {

	@Autowired
	SentimentRepository repo;

	@SuppressWarnings("deprecation")
	@Test
	public void testCreate() throws MalformedURLException, TextAPIException {
		SentimentRequest request = new SentimentRequest();
		request.setUrl(new URL("https://www.wired.com/2016/09/beautiful-book-reveals-architectures-impact-politics/"));
		request.setMode("document");
		SentimentService service = new SentimentService();
		BloomingReefSentiment sentiment = service.analyze(request);
		Assert.assertEquals("subjective", sentiment.getSubjectivity());
		Assert.assertEquals("neutral", sentiment.getPolarity());
		Assert.assertEquals(0.5301524996757507, sentiment.getSubjectivityConfidence());
	}

}
