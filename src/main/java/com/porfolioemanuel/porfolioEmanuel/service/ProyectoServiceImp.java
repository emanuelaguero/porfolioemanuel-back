
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Proyecto;

import java.util.List;
import java.util.Optional;


public interface ProyectoServiceImp {
      
    public List<Proyecto> listarProyecto();
    public void crearProyecto(Proyecto  p);
    
    public Optional <Proyecto> buscarIdProyecto(Long idProyecto);
    public Proyecto editarProyecto(Proyecto p, Long idProyecto);
    public void eliminarProyecto(Long idProyecto);
}
