package br.com.microservice.loja.clilent;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.microservice.loja.dtos.InfoFornecedorDTO;
import br.com.microservice.loja.dtos.InfoPedidoDTO;
import br.com.microservice.loja.dtos.ItemDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	@RequestMapping("/info/{uf}")
	InfoFornecedorDTO getInfoByEstado(@PathVariable String uf);

	@PostMapping("/info/pedido")
	InfoPedidoDTO realizaPedido(List<ItemDTO> itens);

}
