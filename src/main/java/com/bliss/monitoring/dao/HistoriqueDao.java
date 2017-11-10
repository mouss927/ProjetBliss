package com.bliss.monitoring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bliss.monitoring.model.Historique;

public interface HistoriqueDao extends JpaRepository<Historique, Integer> {

	Historique findByIdHistorique(int id);

	
}
