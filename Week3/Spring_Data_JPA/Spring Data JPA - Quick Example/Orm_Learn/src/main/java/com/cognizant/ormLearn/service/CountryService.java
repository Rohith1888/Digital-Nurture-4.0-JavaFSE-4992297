package com.cognizant.ormLearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormLearn.model.Country;
import com.cognizant.ormLearn.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository repo;
	
	@Transactional
	public List<Country> getAllCountries(){
		return repo.findAll();
	}

}
