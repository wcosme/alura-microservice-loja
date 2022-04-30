package br.com.microservice.fornecedor.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_FORNECEDOR")
public class InfoFornecedor implements Serializable {
	
	private static final long serialVersionUID = -6979595342849992120L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;	
	private String nome;	
	private String endereco;	
	private String estado;
	private String uf;

}
