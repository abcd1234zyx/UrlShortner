package com.Short.Shortner;

public class UrlRequestMapperDTO {
	public static Url RequestDtoToUrl(UrlRequestDTO requestObj)
	{
		Url url=new Url();
		System.out.println(requestObj.getLongUrl());
		url.setLongUrl(requestObj.getLongUrl());
		return url;
	}
}
