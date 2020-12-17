package com.koussaila.creatingPDFReportInSpringBoot.service;

import java.util.List;

import com.koussaila.creatingPDFReportInSpringBoot.model.City;

public interface ICityService {
	List<City> findAll();
}
