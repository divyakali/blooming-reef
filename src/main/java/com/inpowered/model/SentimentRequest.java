package com.inpowered.model;

import java.net.URL;

public class SentimentRequest {
	private URL url;
	private String mode;
	private String text;
	private String language;
	/**
	 * @param url
	 * @param mode
	 * @param text
	 * @param language
	 */
	public SentimentRequest(URL url, String mode, String text, String language) {
		super();
		this.url = url;
		this.mode = mode;
		this.text = text;
		this.language = language;
	}
	/**
	 * 
	 */
	public SentimentRequest() {
	}
	/**
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(URL url) {
		this.url = url;
	}
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
