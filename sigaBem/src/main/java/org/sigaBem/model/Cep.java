package org.sigaBem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "cep")
public class Cep {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private double peso;
	

	private String cepOrigem;
	
	
	private String cepDestino;
	

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
