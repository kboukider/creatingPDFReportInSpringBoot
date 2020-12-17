package com.koussaila.creatingPDFReportInSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koussaila.creatingPDFReportInSpringBoot.model.City;
import com.koussaila.creatingPDFReportInSpringBoot.repository.CityRepository;

@Service
public class CityService implements ICityService {

	@Autowired
	CityRepository repository;
	
	@Override
	public List<City> findAll() {
		
		return  (List<City>) repository.findAll();
	}

}
