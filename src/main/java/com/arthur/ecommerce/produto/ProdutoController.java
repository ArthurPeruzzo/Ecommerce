package com.arthur.ecommerce.produto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api("Produto")
@RestController
@RequestMapping(value = "/api/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar produto por id")
    public ResponseEntity<Produto> buscarProduto(@PathVariable(value = "id") Long id){
        Produto produto = produtoService.buscarProdutoPorId(id);
        return ResponseEntity.ok().body(produto);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir produto")
    public ResponseEntity<Produto> inserirProduto(@Valid @RequestBody Produto produto){
        Produto produtoResultado = produtoService.inserirProduto(produto);
        return ResponseEntity.ok().body(produtoResultado);
    }

    @PutMapping("/atualizar")
    @ApiOperation(value = "Atualizar produto")
    public ResponseEntity<Produto> atualizarProduto(@Valid @RequestBody Produto produto){
        Produto produtoResultado = produtoService.atualizarProduto(produto);
        return ResponseEntity.ok().body(produtoResultado);
    }

    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deletar produto por id")
    public void deletarProduto(@PathVariable(value = "id") Long id){
        produtoService.deletarProduto(id);
    }

}
