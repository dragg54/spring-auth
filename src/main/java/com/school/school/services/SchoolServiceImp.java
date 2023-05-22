package com.school.school.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.school.models.School;
import com.school.school.repos.SchoolRepo;

@Service
public class SchoolServiceImp implements SchoolService {
	private SchoolRepo repo;

	public SchoolServiceImp(SchoolRepo repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public School createSchool(School school) {
		return repo.save(school);
	}
	
	@Override
	public List<School> getAllSchools(){
		return repo.findAll();
	}
	
	public School updateSchool(Long id, School school) {
		School existingSchool = repo.findById(id).orElseThrow(null);
		existingSchool.setAddress(school.getAddress());
		existingSchool.setProprietor(school.getProprietor());
		repo.save(existingSchool);
		return existingSchool;
	}
	
}
