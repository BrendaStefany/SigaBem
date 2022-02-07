package org.sigaBem.model;

public class CepDados {
	
	//private long cep;
	
	//private String estadoCep;
	private String uf;
	
	//private String estadoCepDestino;
	
	private String ddd;

	public CepDados() {
		
	}

	public CepDados(String uf, String ddd) {
		this.uf = uf;
		this.ddd = ddd;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
}
