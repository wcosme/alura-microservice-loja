package br.com.microservice.loja.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.microservice.loja.clilent.FornecedorClient;
import br.com.microservice.loja.dtos.CompraDTO;
import br.com.microservice.loja.dtos.InfoFornecedorDTO;
import br.com.microservice.loja.dtos.InfoPedidoDTO;
import br.com.microservice.loja.model.Compra;
import br.com.microservice.loja.services.CompraService;

@Service
public class CompraServiceImpl implements CompraService {
	
	@Autowired
	private FornecedorClient client;

	@HystrixCommand(fallbackMethod = "realizaCompraFallback")
	@Override
	public Compra realizaCompra(CompraDTO compraDTO) {
		
		InfoFornecedorDTO info = client.getInfoByEstado(compraDTO.getEndereco().getEstado());
		
		InfoPedidoDTO pedido = client.realizaPedido(compraDTO.getItens());
		
		System.out.println(info.getEstado());
		
		var compraRealizada = new Compra();
		
		BeanUtils.copyProperties(pedido, compraRealizada);
					
		return compraRealizada;
	}
	
	public Compra realizaCompraFallback(CompraDTO compraDTO) {
		
		var compraFallback = new Compra();
		compraFallback.setEnderecoDestino(compraDTO.getEndereco().toString());
		
		return compraFallback;
		
	}
}
