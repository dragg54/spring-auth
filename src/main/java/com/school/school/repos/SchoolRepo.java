package com.school.school.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.school.models.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {

}
