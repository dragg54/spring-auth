package com.school.school.services;

import java.util.List;

import com.school.school.models.School;

public interface SchoolService {
	School createSchool(School school);
	List<School> getAllSchools();
	School updateSchool(Long uniqueReferenceNumber, School school);
}
