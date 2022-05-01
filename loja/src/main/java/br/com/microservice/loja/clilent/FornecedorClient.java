package br.com.microservice.loja.clilent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.microservice.loja.dtos.InfoFornecedorDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	@RequestMapping("/info/{uf}")
	InfoFornecedorDTO getInfoByEstado(@PathVariable String uf);

}
