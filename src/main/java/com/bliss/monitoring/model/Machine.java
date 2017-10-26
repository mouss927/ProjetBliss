package com.bliss.monitoring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Machine{
	
	@Id
	@GeneratedValue

	private Integer idMachine;
	@Column(nullable = false)
	private int idSalle;
	@Column(nullable = false)
	private String nomMachine;
	@Column(nullable = false)
	private String urlMachine;
	@Column(nullable = false)
	private String ram;
	@Column(nullable = false)
	private boolean etat;
	@Column(nullable = true)
	private String message;
	@Column(nullable = false)
	private String disque;
	@Column(nullable = false)
	private String dateDernierRecut;
	
	
	
	
	
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
	public String getDisque() {
		return disque;
	}
	public void setDisque(String disque) {
		this.disque = disque;
	}
	public String getDateDernierRecut() {
		return dateDernierRecut;
	}
	public void setDateDernierRecut(String dateDernierRecut) {
		this.dateDernierRecut = dateDernierRecut;
	}
	public void setIdMachine(Integer idMachine) {
		this.idMachine = idMachine;
	}

	public Machine(Integer idMachine, int idSalle, String nomMachine, String urlMachine, String ram, boolean etat,
			String message, String disque, String dateDernierRecut) {
		super();
		this.idMachine = idMachine;
		this.idSalle = idSalle;
		this.nomMachine = nomMachine;
		this.urlMachine = urlMachine;
		this.ram = ram;
		this.etat = etat;
		this.message = message;
		this.disque = disque;
		this.dateDernierRecut = dateDernierRecut;
	}
	public Machine() {

	}
	
	
	
	

}
