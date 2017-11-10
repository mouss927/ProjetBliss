package com.bliss.monitoring.dto;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.jtransfo.DomainClass;

import lombok.Data;

@Data
@DomainClass("com.bliss.monitoring.model.Historique")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HistoriqueDto {

	private Integer idHistorique;
	private Integer idMachine;
	private String nomMachine;
	private String message;
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
	public HistoriqueDto(Integer idHistorique, Integer idMachine,String nomMachine, String message, String date) {
		super();
		this.idHistorique = idHistorique;
		this.idMachine = idMachine;
		this.nomMachine = nomMachine;
		this.message = message;
		this.date= date;
	}
	public HistoriqueDto() {
		super();
	}
	
	
}
