package br.com.microservice.loja.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.loja.model.CompraModel;

public interface CompraRepository extends JpaRepository<CompraModel, UUID> {

}
