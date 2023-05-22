package com.school.school.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import com.school.school.models.User;

@Repository
public interface UserRepo extends  JpaRepository<User, Long>{
	UserDetails findByEmail(String email);

}
