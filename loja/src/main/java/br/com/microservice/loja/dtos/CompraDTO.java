package br.com.microservice.loja.dtos;

import java.util.List;

import lombok.Data;

@Data
public class CompraDTO {
	
	private Long id;	
	private List<ItemDTO> itens;	
	private EnderecoDTO endereco;

}
