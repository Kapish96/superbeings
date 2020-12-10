package com.example.superbeings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MapBoxServiceUrlBuilder {
	
	@Autowired
	private String mapBoxApiUrl;
	
	public String getMapBoxApiUrl() {
		return UriComponentsBuilder.fromUriString(mapBoxApiUrl)
				.path("mapbox.places/Instanbul.json")
				.queryParam("country", "TR")
				.queryParam("types", "poi")
				.queryParam("limit", "10")
				.queryParam("language", "English")
				.queryParam("autocomplete", "false")
				.queryParam("access_token", "pk.eyJ1Ijoia2FwaXNoIiwiYSI6ImNraWhmb2EzeTBvZTIycG1xMHVpZzFhZ2MifQ.kC7yzCkexFBaTso6btELvA")
				.build()
				.toUriString();
		
//		https://api.mapbox.com/geocoding/v5/mapbox.places/Instanbul.json?
//			country=TR&types=poi&limit=10&language=English&autocomplete=false&access_token=pk.eyJ1Ijoia2FwaXNoIiwiYSI6ImNraWhmb2EzeTBvZTIycG1xMHVpZzFhZ2MifQ.kC7yzCkexFBaTso6btELvA
	}

}
