package com.school.school.controllers;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.school.models.School;
import com.school.school.services.SchoolService;

@RestController
@RequestMapping(value="/api/schools")
public class SchoolController {
	private SchoolService schoolService;

	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@PostMapping(value="schools")
	public ResponseEntity<School> createSchool(@RequestBody School school){
		return new  ResponseEntity<School>(schoolService.createSchool(school), HttpStatus.CREATED );

	}
	
	@GetMapping(value="")
	public List<School> getSchools(){
		System.out.println("We are fucking here");
		return schoolService.getAllSchools();
	}
	
	@PutMapping(value="{id}")
	public ResponseEntity<School> updateSchool(@PathVariable Long id, @RequestBody School school){
		return new ResponseEntity<School>(schoolService.updateSchool(id, school), HttpStatus.OK);
	}
}
