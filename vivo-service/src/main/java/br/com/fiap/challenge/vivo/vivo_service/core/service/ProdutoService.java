package br.com.fiap.challenge.vivo.vivo_service.core.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.fiap.challenge.vivo.vivo_service.core.entity.Produto;
import br.com.fiap.challenge.vivo.vivo_service.core.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
  private final ProdutoRepository productRepository;

    public List<Produto> findAll(){
        return productRepository.findAll();
    }

    public Produto findById(UUID id){
        return productRepository.findById(id).orElse(null);
    }

    public Produto saveProduct(Produto product){
        return productRepository.save(product);
    }

    public boolean existsById(UUID id){
        return productRepository.existsById(id);
    }
}
