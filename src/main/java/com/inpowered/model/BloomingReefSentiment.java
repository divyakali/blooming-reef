package com.inpowered.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.aylien.textapi.responses.Sentiment;

@Entity
public class BloomingReefSentiment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(unique = true)
	private String url;

	private String text;
	private String subjectivity;
	private double subjectivityConfidence;
	private String polarity;
	private double polarityConfidence;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the subjectivity
	 */
	public String getSubjectivity() {
		return subjectivity;
	}

	/**
	 * @param subjectivity
	 *            the subjectivity to set
	 */
	public void setSubjectivity(String subjectivity) {
		this.subjectivity = subjectivity;
	}

	/**
	 * @return the subjectivityConfidence
	 */
	public double getSubjectivityConfidence() {
		return subjectivityConfidence;
	}

	/**
	 * @param subjectivityConfidence
	 *            the subjectivityConfidence to set
	 */
	public void setSubjectivityConfidence(double subjectivityConfidence) {
		this.subjectivityConfidence = subjectivityConfidence;
	}

	/**
	 * @return the polarity
	 */
	public String getPolarity() {
		return polarity;
	}

	/**
	 * @param polarity
	 *            the polarity to set
	 */
	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}

	/**
	 * @return the polarityConfidence
	 */
	public double getPolarityConfidence() {
		return polarityConfidence;
	}

	/**
	 * @param polarityConfidence
	 *            the polarityConfidence to set
	 */
	public void setPolarityConfidence(double polarityConfidence) {
		this.polarityConfidence = polarityConfidence;
	}

	/**
	 * 
	 */
	public BloomingReefSentiment() {
		super();
	}

	public BloomingReefSentiment(Sentiment sentiment) {
		this.setPolarity(sentiment.getPolarity());
		this.setPolarityConfidence(sentiment.getPolarityConfidence());
		this.setText(sentiment.getText());
		this.setSubjectivity(sentiment.getSubjectivity());
		this.setSubjectivityConfidence(sentiment.getSubjectivityConfidence());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BloomingReefSentiment [id=" + id + ", url=" + url + ", text="
				+ text + ", subjectivity=" + subjectivity
				+ ", subjectivityConfidence=" + subjectivityConfidence
				+ ", polarity=" + polarity + ", polarityConfidence="
				+ polarityConfidence + "]";
	}

}
