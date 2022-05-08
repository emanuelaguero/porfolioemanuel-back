
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Habilidad;
import com.porfolioemanuel.porfolioEmanuel.repository.HabilidadRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements HabilidadServiceImp{
    @Autowired
    public HabilidadRepository habilidadRepository;
    @Override
    public List<Habilidad> listarHabilidad() {
        return habilidadRepository.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad h) {
        habilidadRepository.save(h);
    }

    @Override
    public Optional<Habilidad> buscarIdHabilidad(Long idHabilidad) {
        return habilidadRepository.findById(idHabilidad);
    }

    @Override
    public Habilidad editarHabilidad(Habilidad h, Long idHabilidad) {
       
       Habilidad existeHabilidad= habilidadRepository.findById(idHabilidad).orElse(null);
        existeHabilidad.setNombreHabilidad(h.getNombreHabilidad());
        existeHabilidad.setPorcHabilidad(h.getPorcHabilidad());
        existeHabilidad.setNivelHabilidad(h.getNivelHabilidad());
        return habilidadRepository.save(existeHabilidad);
    }

    @Override
    public void eliminarHabilidad(Long idHabilidad) {
        habilidadRepository.deleteById(idHabilidad);
    }
    
}
