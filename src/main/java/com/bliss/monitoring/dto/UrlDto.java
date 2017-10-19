package com.bliss.monitoring.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.jtransfo.DomainClass;
import org.jtransfo.MappedBy;
import org.jtransfo.NotMapped;

import lombok.Data;

@Data
@DomainClass("com.bliss.monitoring.model.Url")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UrlDto {
	@MappedBy
	private Long id;
	@MappedBy
	private String name;
	@MappedBy
	private String value;
	@NotMapped
	private boolean status;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public UrlDto() {
	}
	public UrlDto(Long id, String name, String value, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.status = status;
	}
	

}
