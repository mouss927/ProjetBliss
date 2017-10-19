package com.bliss.monitoring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bliss.monitoring.model.Url;

public interface UrlDao extends JpaRepository<Url, Long> {
	Url findByName(String name);
	List<Url> findAll();
	
}
