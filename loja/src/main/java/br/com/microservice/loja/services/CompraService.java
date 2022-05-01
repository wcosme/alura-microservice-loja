package br.com.microservice.loja.services;

import br.com.microservice.loja.dtos.CompraDTO;
import br.com.microservice.loja.model.Compra;

public interface CompraService {

	Compra realizaCompra(CompraDTO compraDTO);

}
