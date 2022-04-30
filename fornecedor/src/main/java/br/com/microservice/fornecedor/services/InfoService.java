package br.com.microservice.fornecedor.services;

import java.util.Optional;

import br.com.microservice.fornecedor.model.InfoFornecedor;

public interface InfoService {

	Optional<InfoFornecedor> finByEstado(String estado);

	InfoFornecedor saveFornecedor(InfoFornecedor infoFornecedor);

}
