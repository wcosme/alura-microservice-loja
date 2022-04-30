package br.com.microservice.fornecedor.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import br.com.microservice.fornecedor.services.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{uf}")
	public ResponseEntity<Object> getInfoByEstado(@PathVariable String uf){
		
		Optional<InfoFornecedor> infoFornecedorOptional = infoService.finByEstado(uf);
		
		if(!infoFornecedorOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("UF not found.");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(infoFornecedorOptional.get());		
	}
	
	@PostMapping("/fornecedor")
	public ResponseEntity<Object> saveFornecedor(@RequestBody InfoFornecedor infoFornecedor){
		
		InfoFornecedor fornecedor = infoService.saveFornecedor(infoFornecedor);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
		
	}

}
