package br.com.fiap.challenge.vivo.vivo_service.core.entity;
import java.util.UUID;

import br.com.fiap.challenge.vivo.vivo_service.core.dto.ProdutoCreateDto;
import br.com.fiap.challenge.vivo.vivo_service.core.enums.ProductType;
import br.com.fiap.challenge.vivo.vivo_service.core.enums.SubscriptionType;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "produto")
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private UUID id;
   private String productName;
   private ProductType productType;
   private SubscriptionType subscriptionType;

    public Produto(@Valid ProdutoCreateDto dados) {
        this.productName = dados.productName();
        this.productType = dados.productType();
        this.subscriptionType =dados.subscriptionType();
    }
}
