package com.example.superbeings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.superbeings.model.MasterData;

@Service
public class MapBoxService {
	
	@Autowired
	private RestTemplate mapBoxApiRestTemplate;
	
	@Autowired
	private MapBoxServiceUrlBuilder mapBoxServiceUrlBuilder;
	
	public MasterData getPlaces() {
		return mapBoxApiRestTemplate.getForEntity(mapBoxServiceUrlBuilder.getMapBoxApiUrl(), MasterData.class).getBody();
	}

}
