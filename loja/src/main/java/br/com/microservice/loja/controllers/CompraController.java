package br.com.microservice.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.dtos.CompraDTO;
import br.com.microservice.loja.services.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping
	public void efetuaCompra(@RequestBody CompraDTO compraDTO) {
		compraService.realizaCompra(compraDTO);
	}	
}
