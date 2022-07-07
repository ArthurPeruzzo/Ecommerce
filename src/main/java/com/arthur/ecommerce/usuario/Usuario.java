package com.arthur.ecommerce.usuario;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIO")
@Getter @Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("Identificador")
    @Column(name = "ID")
    private Long id;

    @ApiModelProperty("Nome")
    @Size(max = 100, message = "O nome deve possuir no máximo 100 caracteres.")
    @NotNull
    private String nome;

    @ApiModelProperty("Email")
    @Email
    @NotNull
    private String email;

    @ApiModelProperty("Telefone")
    @NotNull
    private String telefone;

}
