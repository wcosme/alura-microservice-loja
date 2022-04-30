package br.com.microservice.loja.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class CompraModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private UUID id;

}
