package com.arthur.ecommerce.produto.enums;

import lombok.Getter;

@Getter
public enum ProdutoTipo {

    ELETRONICO("Eletronico"),
    LIVRO("Livro"),
    PET("Pet");

    private String descricao;

    ProdutoTipo(String descricao) {
        this.descricao = descricao;
    }

}
