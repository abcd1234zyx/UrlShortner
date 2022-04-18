package com.Short.Shortner;
import com.Short.Algorithm.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
	@Autowired
	ShortenAlgorithm sAlgo;
	@GetMapping("/hello")
	public String print() {
		return "hello api world";
	}
	@PostMapping(value = "/submit")
	public UrlResponseDTO createUser(@RequestBody UrlRequestDTO urlDTO) {
		System.out.println("in createUser");
		Url url=UrlRequestMapperDTO.RequestDtoToUrl(urlDTO);
		System.out.println(url.getLongUrl());
		url.setShortUrl(sAlgo.longUrlToShortUrl(url.getLongUrl()));
		System.out.println(url.getShortUrl());
		return UrlResponseMapperDTO.UrlToResponseDTO(url);
	}
}
