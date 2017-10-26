package com.bliss.monitoring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bliss.monitoring.model.Machine;

public interface MachineDao extends JpaRepository<Machine, Integer> {

	Machine findByUrlMachine(String url);
//	Machine findByName(String name);
//	List<Machine> findAll();
	
}
