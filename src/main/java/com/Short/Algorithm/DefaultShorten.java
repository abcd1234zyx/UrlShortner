package com.Short.Algorithm;

import org.springframework.stereotype.Component;

@Component
public class DefaultShorten implements ShortenAlgorithm {
	public String longUrlToShortUrl(String longUrl) {
		System.out.println("in default class");
		return longUrl;
		
	}
	
	public  String shortUrlToLongUrl(String shortUrl) {
		System.out.println("in default class");
		return shortUrl;
	}

}