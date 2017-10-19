package com.bliss.monitoring.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.jtransfo.DomainClass;

import lombok.Data;

@Data
@DomainClass("com.bliss.monitoring.model.Url")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MachineDto {

	private int idMachine;
	private float ram;
	private boolean etat;
	private String message;
	
	public int getIdMachine() {
		return idMachine;
	}
	public void setIdMachine(int idMachine) {
		this.idMachine = idMachine;
	}
	public float getRam() {
		return ram;
	}
	public void setRam(float ram) {
		this.ram = ram;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MachineDto() {
	}
	public MachineDto(int idMachine, float ram, boolean etat, String message) {
		super();
		this.idMachine = idMachine;
		this.ram = ram;
		this.etat = etat;
		this.message = message;
	}
	
	
	
	

}
