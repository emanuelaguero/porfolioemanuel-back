
package com.porfolioemanuel.porfolioEmanuel.service;


import com.porfolioemanuel.porfolioEmanuel.model.Habilidad;
import java.util.List;
import java.util.Optional;


public interface HabilidadServiceImp {
     public List<Habilidad> listarHabilidad();
    public void crearHabilidad(Habilidad h);
    
    public Optional <Habilidad> buscarIdHabilidad(Long idHabilidad);
    public Habilidad editarHabilidad(Habilidad h, Long idHabilidad);
    public void eliminarHabilidad(Long idHabilidad);
}
