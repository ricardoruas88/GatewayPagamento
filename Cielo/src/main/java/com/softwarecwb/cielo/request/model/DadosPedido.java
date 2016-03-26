package com.softwarecwb.cielo.request.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

import javax.xml.bind.annotation.XmlElement;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.enumerador.Idioma;
import com.softwarecwb.cielo.request.model.enumerador.Moeda;

public class DadosPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Length(max = 20)
	private String numeroPedido;

	@Length(min = 1, max = 12)
	private Double valor;

	private Optional<Moeda> moeda;

	private Date dataHora;

	@Length(max = 1024)
	private Optional<String> descricao;

	private Optional<Idioma> idioma;

	@Length(min = 1, max = 9)
	private Optional<Integer> taxaEmbarque;

	@Length(max = 13)
	private Optional<String> softDescriptor;

	public DadosPedido() {
		// TODO Auto-generated constructor stub
	}

	public DadosPedido(String numeroPedido, Double valor, Moeda moeda, Date dataHora, String descricao, Idioma idioma,
			Integer taxaEmbarque, String softDescriptor) {
		super();
		this.numeroPedido = numeroPedido;
		this.valor = valor;
		this.moeda = Optional.ofNullable(moeda);
		this.dataHora = dataHora;
		this.descricao = Optional.ofNullable(descricao);
		this.idioma = Optional.ofNullable(idioma);
		this.taxaEmbarque = Optional.ofNullable(taxaEmbarque);
		this.softDescriptor = Optional.ofNullable(softDescriptor);
	}

	// GETTERS
	@XmlElement(name = "numero")
	public String getNumeroPedido() {
		return numeroPedido;
	}

	@XmlElement(name = "valor")
	public String getValor() {
		String v = String.valueOf(valor);
		return v.replace(".", "");
	}

	@XmlElement(name = "moeda")
	public int getMoeda() {
		return moeda.orElse(Moeda.REAL).getValor();
	}

	@XmlElement(name = "data-hora")
	public Date getDataHora() {
		return dataHora;
	}

	@XmlElement(name = "descricao")
	public Optional<String> getDescricao() {
		return descricao;
	}

	@XmlElement(name = "idioma")
	public Idioma getIdioma() {
		return idioma.orElse(Idioma.PT);
	}

	@XmlElement(name = "taxa-embarque")
	public Optional<Integer> getTaxaEmbarque() {
		return taxaEmbarque;
	}

	@XmlElement(name = "soft-descriptor")
	public Optional<String> getSoftDescriptor() {
		return softDescriptor;
	}

	// SETTERS
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = Optional.ofNullable(moeda);
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public void setDescricao(String descricao) {
		this.descricao = Optional.ofNullable(descricao);
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = Optional.ofNullable(idioma);
	}

	public void setTaxaEmbarque(Integer taxaEmbarque) {
		this.taxaEmbarque = Optional.ofNullable(taxaEmbarque);
	}

	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = Optional.ofNullable(softDescriptor);
	}

}