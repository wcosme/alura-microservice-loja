package br.com.microservice.fornecedor.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import br.com.microservice.fornecedor.repository.InfoRepository;
import br.com.microservice.fornecedor.services.InfoService;

@Service
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	@Override
	public Optional<InfoFornecedor> finByEstado(String uf) {
		
		return infoRepository.findByUf(uf);
	}

	@Override
	public InfoFornecedor saveFornecedor(InfoFornecedor infoFornecedor) {		
		return infoRepository.save(infoFornecedor);
	}

}
