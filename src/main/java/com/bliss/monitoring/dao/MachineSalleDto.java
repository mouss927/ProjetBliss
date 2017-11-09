package com.bliss.monitoring.dao;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.jtransfo.DomainClass;

import lombok.Data;

@Data
@DomainClass("com.bliss.monitoring.model.Machine")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MachineSalleDto {

	private List<Integer> idMachine = new ArrayList<Integer>();
	private int idSalle;

	
	public List<Integer> getIdMachine() {
		return idMachine;
	}

	public void setIdMachine(List<Integer> idMachine) {
		this.idMachine = idMachine;
	}

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	
	public MachineSalleDto(List<Integer> idMachine, int idSalle) {
		super();
		this.idMachine = idMachine;
		this.idSalle = idSalle;
	}

	public MachineSalleDto() {

	}
	
	
	
	

}
