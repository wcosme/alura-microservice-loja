package br.com.microservice.loja.dtos;

import lombok.Data;

@Data
public class EnderecoDTO {
		
	private String rua;
	private int numero;
	private String estado;

}
