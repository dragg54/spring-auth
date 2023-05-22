package com.school.school.models;
import jakarta.persistence.Id;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name="school")
@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="proprietor")
	private String proprietor;
	
	@Column(name="address")
	private String address;
	
	@Column(name="school_fees")
	private String schoolFees; 
	
	@Column(name="created_at")
	@CreationTimestamp
	private LocalDateTime createdAt; 
	
	public String getProprietor() {
		return proprietor;
	}
	public void setProprietor(String proprietor) {
		this.proprietor = proprietor;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSchoolFees() {
		return schoolFees;
	}
	public void setSchoolFees(String schoolFees) {
		this.schoolFees = schoolFees;
	}
	public  LocalDateTime getCreatedAt() {
		return this.createdAt;
	}

}
