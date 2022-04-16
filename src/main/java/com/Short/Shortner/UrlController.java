package com.Short.Shortner;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
	@PostMapping(value="/submit")
	public Url createUser( Url url) {
		
		return url;
	}
}
