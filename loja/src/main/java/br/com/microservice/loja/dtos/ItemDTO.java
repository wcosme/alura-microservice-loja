package br.com.microservice.loja.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class ItemDTO {
	
	private UUID id;
	private int quantidade;

}
