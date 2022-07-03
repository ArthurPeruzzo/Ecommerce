package com.arthur.ecommerce.fabricante;

import org.springframework.stereotype.Service;

@Service
public class FabricanteService {

    private final FabricanteRepository fabricanteRepository;

    public FabricanteService(FabricanteRepository fabricanteRepository) {
        this.fabricanteRepository = fabricanteRepository;
    }

    public Fabricante inserirFabricante(Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }

    public Fabricante buscarFabricantePorId(Long id) {
        return fabricanteRepository.findById(id).orElse(null);
    }

    public Fabricante atualizarFabricante(Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }

    public void deletarFabricante(Long id) {
        fabricanteRepository.deleteById(id);
    }


}
