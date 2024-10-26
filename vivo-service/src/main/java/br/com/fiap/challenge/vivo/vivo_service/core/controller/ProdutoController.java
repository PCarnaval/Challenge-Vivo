package br.com.fiap.challenge.vivo.vivo_service.core.controller;

import java.util.List;
import java.util.UUID;

import br.com.fiap.challenge.vivo.vivo_service.core.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.challenge.vivo.vivo_service.core.dto.ProdutoDto;
import br.com.fiap.challenge.vivo.vivo_service.core.entity.Produto;
import br.com.fiap.challenge.vivo.vivo_service.core.mapper.ProdutoMapper;
import br.com.fiap.challenge.vivo.vivo_service.core.service.ProdutoService;
import br.com.fiap.challenge.vivo.vivo_service.core.dto.ProdutoCreateDto;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProdutoController {
  private final ProdutoMapper produtoMapper;
  private final ProdutoService produtoService;
  private final ProdutoRepository repository;

  @GetMapping
  public List<Produto> getAll(){

    return repository.findAll();
  }


  @PostMapping
  @Transactional
  public void cadastrar(@RequestBody @Valid ProdutoCreateDto dados){repository.save(new Produto(dados));
  }
}
