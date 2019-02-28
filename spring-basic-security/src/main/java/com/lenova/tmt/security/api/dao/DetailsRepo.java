package com.lenova.tmt.security.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenova.tmt.security.api.model.Details;

public interface DetailsRepo extends JpaRepository<Details , Integer> {

	String findById(String string);

	
	

}
