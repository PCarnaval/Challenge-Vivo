package br.com.fiap.challenge.vivo.vivo_service.core.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.challenge.vivo.vivo_service.core.entity.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

}
