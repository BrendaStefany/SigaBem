package org.sigaBem.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Calendar;
import java.util.Date;

import org.sigaBem.model.Cep;
import org.sigaBem.model.CepDados;
import org.sigaBem.util.Util;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class CepService {

	String webService = "http://viacep.com.br/ws/";
	
	public CepDados consultar(String cep) throws IOException, InterruptedException {

		CepDados cepObj = new CepDados();

		String urlDaApi = webService + cep + "/json";
		URL url;
		url = new URL(urlDaApi);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

        BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
        String jsonEmString = Util.converteJsonEmString(resposta);

        Gson gson = new Gson();
        cepObj = gson.fromJson(jsonEmString, CepDados.class);
        
		return cepObj;
		
		//
	}

	public Cep calcularFrete(CepDados cepOrigem, CepDados cepDestino, double peso) {

		double desconto = 0;
		double vlFrete = 0;
		int diasPrevistos = 0;

		vlFrete = peso * 1;
		
		if (cepOrigem.getDdd().equals(cepDestino.getDdd())) {
			desconto = 0.5;
			vlFrete = vlFrete * desconto;
			diasPrevistos = 1;

		}

		else if (cepOrigem.getUf().equals(cepDestino.getUf())) {
			desconto = 0.75;
			vlFrete = vlFrete * desconto;
			diasPrevistos = 3;

		} else {

			diasPrevistos = 10;

		}

		Cep cepModel = new Cep();

		cepModel.setVlTotalFrete(vlFrete);

		Date dataEntrega = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(dataEntrega);
		cal.add(Calendar.DATE, diasPrevistos);
		dataEntrega = cal.getTime();

		cepModel.setDataPrevistaEntrega(dataEntrega);

		return cepModel;
	}

}
