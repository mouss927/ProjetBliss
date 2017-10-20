package com.bliss.monitoring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bliss.monitoring.model.Machine;

public interface MachineDao extends JpaRepository<Machine, Integer> {
//	Machine findByName(String name);
//	List<Machine> findAll();
	
}
