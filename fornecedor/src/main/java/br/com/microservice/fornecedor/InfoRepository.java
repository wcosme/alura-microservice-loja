package br.com.microservice.fornecedor;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InfoRepository extends JpaRepository<T, UUID> {

}
