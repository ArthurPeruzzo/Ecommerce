package com.arthur.ecommerce.fabricante;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api("Fabricante")
@RestController
@RequestMapping(value = "/api/fabricante")
public class FabricanteController {

    private final FabricanteService fabricanteService;

    public FabricanteController(FabricanteService fabricanteService) {
        this.fabricanteService = fabricanteService;
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar fabricante por id")
    public ResponseEntity<Fabricante> buscarFabricante(@PathVariable(value = "id") Long id){
        Fabricante fabricante = fabricanteService.buscarFabricantePorId(id);
        return ResponseEntity.ok().body(fabricante);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir fabricante")
    public ResponseEntity<Fabricante> inserirFabricante(@Valid @RequestBody Fabricante fabricante){
        Fabricante fabricanteResultado = fabricanteService.inserirFabricante(fabricante);
        return ResponseEntity.ok().body(fabricanteResultado);
    }

    @PutMapping("/atualizar")
    @ApiOperation(value = "Atualizar fabricante")
    public ResponseEntity<Fabricante> atualizarFabricante(@Valid @RequestBody Fabricante fabricante){
        Fabricante fabricanteResultado = fabricanteService.atualizarFabricante(fabricante);
        return ResponseEntity.ok().body(fabricanteResultado);
    }

    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deletar fabricante por id")
    public void deletarFabricante(@PathVariable(value = "id") Long id){
        fabricanteService.deletarFabricante(id);
    }

}
