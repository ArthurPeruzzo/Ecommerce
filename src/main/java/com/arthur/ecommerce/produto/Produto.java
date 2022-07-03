package com.arthur.ecommerce.produto;

import com.arthur.ecommerce.produto.enums.ProdutoTipo;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUTO")
@Getter @Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("Identificador")
    @Column(name = "ID")
    private Long id;

    @ApiModelProperty("Nome")
    @Size(max = 100, message = "O nome deve possuir no máximo 100 caracteres.")
    @NotNull
    private String nome;


    @ApiModelProperty("Tipo do produto")
    @NotNull
    @Enumerated(EnumType.STRING)
    private ProdutoTipo tipo;

    @ApiModelProperty("Preço unitário")
    @NotNull
    private BigDecimal precoUnitario;

}
