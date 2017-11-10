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
public class Historique{
	
	@Id
	@GeneratedValue

	private Integer idHistorique;
	@Column(nullable = false)
	private Integer idMachine;
	@Column(nullable = false)
	private String nomMachine;
	@Column(nullable = true)
	private String message;
	@Column(nullable = false)
	private String date;
	
	public Integer getIdHistorique() {
		return idHistorique;
	}
	public void setIdHistorique(Integer idHistorique) {
		this.idHistorique = idHistorique;
	}
	public Integer getIdMachine() {
		return idMachine;
	}
	public void setIdMachine(Integer idMachine) {
		this.idMachine = idMachine;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getNomMachine() {
		return nomMachine;
	}
	public void setNomMachine(String nomMachine) {
		this.nomMachine = nomMachine;
	}
	public Historique(Integer idHistorique, Integer idMachine,String nomMachine, String message, String date) {
		super();
		this.idHistorique = idHistorique;
		this.idMachine = idMachine;
		this.nomMachine = nomMachine;
		this.message = message;
		this.date = date;
	}
	public Historique() {
		super();
	}
	

}
