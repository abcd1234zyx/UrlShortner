package com.Short.Algorithm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ShortenAlgorithmImpl implements ShortenAlgorithm{
	
	public String longUrlToShortUrl(String shortUrl) {
		System.out.println("in cimpl lass");
		return shortUrl;
		
	}
	
	public  String shortUrlToLongUrl(String longUrl) {
		System.out.println("in impl class");
		return longUrl;
	}
				
				
}
