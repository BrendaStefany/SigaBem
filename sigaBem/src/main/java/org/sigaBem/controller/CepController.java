package org.sigaBem.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.sigaBem.model.Cep;
import org.sigaBem.model.CepDados;
import org.sigaBem.repository.CepRepository;
import org.sigaBem.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
@CrossOrigin("*")
public class CepController {

	@Autowired
	private CepRepository repository;
	
	@Autowired
	private CepService service;

	@PostMapping
	public ResponseEntity<Cep> consultar(@RequestBody Cep cep) throws InterruptedException {
		Cep cepResult = null;
		try {
			CepDados cepOrigem = service.consultar(cep.getCepOrigem());
			CepDados cepDestino = service.consultar(cep.getCepDestino());
			cepResult = service.calcularFrete(cepOrigem, cepDestino, cep.getPeso());
			cepResult.setCepOrigem(cep.getCepOrigem());
			cepResult.setCepDestino(cep.getCepDestino());
			cepResult.setNomeDestinatario(cep.getNomeDestinatario());
			cepResult.setPeso(cep.getPeso());
			cep.setDataPrevistaEntrega( cepResult.getDataPrevistaEntrega());
			cep.setVlTotalFrete(cepResult.getVlTotalFrete());
			repository.save(cep);
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(cepResult);
		
	}
	

}
