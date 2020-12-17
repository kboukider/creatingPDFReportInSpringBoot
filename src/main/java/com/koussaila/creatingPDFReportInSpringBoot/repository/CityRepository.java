package com.koussaila.creatingPDFReportInSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.koussaila.creatingPDFReportInSpringBoot.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
