package br.gov.ba.pm.escolar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Municipio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	@Column
	private String municipio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	
}