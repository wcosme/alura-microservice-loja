package br.com.microservice.fornecedor.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.fornecedor.model.InfoFornecedor;
@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, UUID> {

	Optional<InfoFornecedor> findByUf(String uf);

}
