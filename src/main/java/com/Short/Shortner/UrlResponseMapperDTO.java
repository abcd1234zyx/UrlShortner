package com.Short.Shortner;

public class UrlResponseMapperDTO {
	
	public static UrlResponseDTO UrlToResponseDTO(Url url)
	{
		UrlResponseDTO responseObj=new UrlResponseDTO();
		responseObj.setShortUrl(url.getShortUrl());
		return responseObj;
	}

}
