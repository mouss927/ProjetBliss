package com.bliss.monitoring.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bliss.monitoring.model.Machine;

public interface MachineDao extends JpaRepository<Machine, Integer> {

	Machine findByUrlMachine(String url);
	
	Machine findByIdMachine(int idMachine);

	List<Machine> findByIdSalle(int idSalle);
	
	
	
}
