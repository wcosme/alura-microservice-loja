package br.com.microservice.loja.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.loja.clilent.FornecedorClient;
import br.com.microservice.loja.dtos.CompraDTO;
import br.com.microservice.loja.dtos.InfoFornecedorDTO;
import br.com.microservice.loja.services.CompraService;

@Service
public class CompraServiceImpl implements CompraService {
	
	@Autowired
	private FornecedorClient client;

	@Override
	public void realizaCompra(CompraDTO compraDTO) {
		
		InfoFornecedorDTO info = client.getInfoByEstado(compraDTO.getEndereco().getEstado());
		
		System.out.println(info.getEstado());
	}
}
