package com.arthur.ecommerce.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario inserirUsuario(Usuario produto) {
        return usuarioRepository.save(produto);
    }

    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario atualizarUsuario(Usuario produto) {
        return usuarioRepository.save(produto);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }


}
