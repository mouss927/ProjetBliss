package com.bliss.monitoring.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.jtransfo.DomainClass;

import lombok.Data;

@Data
@DomainClass("com.bliss.monitoring.model.Machine")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MachineDto {

	private int idMachine;
	private int idSalle;
	private String nomMachine;
	private String urlMachine;
	private String ram;
	private boolean etat;
	private String message;
	private String dateDernierRecut;
	private String disque;
	
	public int getIdMachine() {
		return idMachine;
	}
	public void setIdMachine(int idMachine) {
		this.idMachine = idMachine;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getNomMachine() {
		return nomMachine;
	}
	public void setNomMachine(String nomMachine) {
		this.nomMachine = nomMachine;
	}
	public String getUrlMachine() {
		return urlMachine;
	}
	public void setUrlMachine(String urlMachine) {
		this.urlMachine = urlMachine;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
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
	public String getDateDernierRecut() {
		return dateDernierRecut;
	}
	public void setDateDernierRecut(String dateDernierRecut) {
		this.dateDernierRecut = dateDernierRecut;
	}
	public String getDisque() {
		return disque;
	}
	public void setDisque(String disque) {
		this.disque = disque;
	}
	
	public MachineDto(int idMachine, int idSalle, String nomMachine, String urlMachine, String ram, boolean etat,
			String message, String dateDernierRecut, String disque) {
		super();
		this.idMachine = idMachine;
		this.idSalle = idSalle;
		this.nomMachine = nomMachine;
		this.urlMachine = urlMachine;
		this.ram = ram;
		this.etat = etat;
		this.message = message;
		this.dateDernierRecut = dateDernierRecut;
		this.disque = disque;
	}
	public MachineDto() {

	}
	
	
	
	

}
