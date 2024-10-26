package br.com.fiap.challenge.vivo.vivo_service.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.fiap.challenge.vivo.vivo_service.core.dto.ProdutoCreateDto;
import br.com.fiap.challenge.vivo.vivo_service.core.dto.ProdutoDto;
import br.com.fiap.challenge.vivo.vivo_service.core.entity.Produto;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProdutoMapper {
  private final ModelMapper modelMapper;

  public Produto map(ProdutoCreateDto dto){
    Produto product = modelMapper.map(dto, Produto.class);
    return product;
  }

  public ProdutoDto map(Produto product){
    ProdutoDto dto = modelMapper.map(product, ProdutoDto.class);
    return dto;
  }
}
