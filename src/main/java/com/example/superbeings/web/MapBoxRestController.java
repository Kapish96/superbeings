package com.example.superbeings.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.superbeings.model.Features;
import com.example.superbeings.model.ItineraryVO;
import com.example.superbeings.model.MasterData;
import com.example.superbeings.service.MapBoxService;

@RestController
public class MapBoxRestController {
	
	@Autowired
	private MapBoxService mapBoxService;
	
	@RequestMapping(value="/itinerary")
	private List<ItineraryVO> getItinerary() {
		MasterData masterData = mapBoxService.getPlaces();
		List<ItineraryVO> itineraryList = new ArrayList<>();
		Features[] features = masterData.getFeatures();
		for (int i = 0; i < features.length; i++) {
			ItineraryVO itineraryVO = new ItineraryVO();
			
			List<String> categoryList = Arrays.asList(features[i].getProperties().getCategory().split(", "));
			itineraryVO.setName(features[i].getText());
			itineraryVO.setCategories(categoryList);
			
			itineraryVO.setRegion(features[i].getContext()[0].getText_English());
			itineraryList.add(itineraryVO);

		}
		return itineraryList;
	}

}
