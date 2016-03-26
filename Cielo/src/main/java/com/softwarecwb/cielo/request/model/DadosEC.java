package com.softwarecwb.cielo.request.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Length;

@XmlRootElement(name = "dados-ec")
public class DadosEC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DadosEC(String numeroEstabelecimento, String chave) {
		this.numeroEstabelecimento = numeroEstabelecimento;
		this.chave = chave;
	}

	public DadosEC() {
		// TODO Auto-generated constructor stub
	}

	@Length(max = 20)
	private String numeroEstabelecimento;

	@Length(max = 100)
	private String chave;

	// GETTERS
	@XmlElement(name = "numero")
	public String getNumeroEstabelecimento() {
		return numeroEstabelecimento;
	}

	@XmlElement(name = "chave")
	public String getChave() {
		return chave;
	}

	// SETTERS
	public void setNumeroEstabelecimento(String numeroEstabelecimento) {
		this.numeroEstabelecimento = numeroEstabelecimento;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

}