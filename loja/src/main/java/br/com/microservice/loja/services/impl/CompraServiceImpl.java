package br.com.microservice.loja.services.impl;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.loja.dtos.CompraDTO;
import br.com.microservice.loja.dtos.InfoFornecedorDTO;
import br.com.microservice.loja.services.CompraService;

@Service
public class CompraServiceImpl implements CompraService {

	@Override
	public void realizaCompra(CompraDTO compraDTO) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://localhost:8081/info/"+compraDTO.getEndereco().getEstado(), HttpMethod.GET, null, InfoFornecedorDTO.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}
}
