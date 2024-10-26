package br.com.fiap.challenge.vivo.vivo_service.core.dto;

import br.com.fiap.challenge.vivo.vivo_service.core.enums.ProductType;
import br.com.fiap.challenge.vivo.vivo_service.core.enums.SubscriptionType;

import java.time.LocalDateTime;
import java.util.List;

public record ProdutoCreateDto(String productName, ProductType productType, SubscriptionType subscriptionType) {

}
