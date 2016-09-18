package com.inpowered.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentRepository extends JpaRepository<BloomingReefSentiment, Long> {
	public BloomingReefSentiment findOneByUrl(String url);

}
