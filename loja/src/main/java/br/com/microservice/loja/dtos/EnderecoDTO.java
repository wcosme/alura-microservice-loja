package br.com.microservice.loja.dtos;

import lombok.Data;

@Data
public class EnderecoDTO {
		
	private Long id;
	private String rua;
	private int numero;
	private String estado;

}
