package com.arthur.ecommerce.usuario;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api("Usuario")
@RestController
@RequestMapping(value = "/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar usuario por id")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable(value = "id") Long id){
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir usuario")
    public ResponseEntity<Usuario> inserirUsuario(@Valid @RequestBody Usuario usuario){
        Usuario usuarioResultado = usuarioService.inserirUsuario(usuario);
        return ResponseEntity.ok().body(usuarioResultado);
    }

    @PutMapping("/atualizar")
    @ApiOperation(value = "Atualizar usuario")
    public ResponseEntity<Usuario> atualizarUsuario(@Valid @RequestBody Usuario usuario){
        Usuario usuarioResultado = usuarioService.atualizarUsuario(usuario);
        return ResponseEntity.ok().body(usuarioResultado);
    }

    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deletar usuario por id")
    public void deletarUsuario(@PathVariable(value = "id") Long id){
        usuarioService.deletarUsuario(id);
    }

}
