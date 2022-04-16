package com.Short.Shortner;
import com.Short.Algorithm.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
	@Autowired
	ShortenAlgorithm sAlgo;
	@GetMapping("/hello")
	public String print() {
		return "hello api world";
	}
	
	@PostMapping(value="/submit")
	public UrlResponseDTO createUser( UrlRequestDTO urlDTO) {
		System.out.println("in createUser");
		Url url=UrlRequestMapperDTO.RequestDtoToUrl(urlDTO);
		System.out.println(sAlgo.getClass());
		url.setShortUrl(sAlgo.longUrlToShortUrl(url.getLongUrl()));
		return UrlResponseMapperDTO.UrlToResponseDTO(url);
	}
}
