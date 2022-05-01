package br.com.microservice.loja.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Compra implements Serializable{
	
	private static final long serialVersionUID = 3903298982321106107L;
	
	private Long compraId;
	private Integer tempoDePreparo;
	private String enderecoDestino;

}
