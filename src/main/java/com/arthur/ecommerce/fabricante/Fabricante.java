package com.arthur.ecommerce.fabricante;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FABRICANTE")
@Getter @Setter
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("Identificador")
    @Column(name = "ID")
    private Long id;

    @NotNull
    @ApiModelProperty("Nome")
    @Column(name = "NOME")
    private String nome;

}
