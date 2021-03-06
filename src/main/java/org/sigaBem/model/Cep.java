package org.sigaBem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "cep")
public class Cep {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Positive(message = "{peso.positive}")
	private double peso;
	
	@NotBlank(message = "{cepOrigem.not.blank}")
	private String cepOrigem;
	
	@NotBlank(message = "{cepDestino.not.blank}")
	private String cepDestino;
	
	@NotBlank(message = "{nomeDestinatario.not.blank}")
	private String nomeDestinatario;
	
	private double vlTotalFrete;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dataPrevistaEntrega;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConsulta = new java.sql.Date(System.currentTimeMillis());
	
	public Cep() {
		
	}	

	public Cep(Long id, double peso, String cepOrigem, String cepDestino, String nomeDestinatario, double vlTotalFrete,
			Date dataPrevistaEntrega, Date dataConsulta) {
		super();
		this.id = id;
		this.peso = peso;
		this.cepOrigem = cepOrigem;
		this.cepDestino = cepDestino;
		this.nomeDestinatario = nomeDestinatario;
		this.vlTotalFrete = vlTotalFrete;
		this.dataPrevistaEntrega = dataPrevistaEntrega;
		this.dataConsulta = dataConsulta;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getCepOrigem() {
		return cepOrigem;
	}


	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}


	public String getCepDestino() {
		return cepDestino;
	}


	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}


	public String getNomeDestinatario() {
		return nomeDestinatario;
	}


	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}


	public double getVlTotalFrete() {
		return vlTotalFrete;
	}


	public void setVlTotalFrete(double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}


	public Date getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}


	public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}


	public Date getDataConsulta() {
		return dataConsulta;
	}


	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	
	
}
