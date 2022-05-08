
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Educacion;
import com.porfolioemanuel.porfolioEmanuel.model.Trabajo;
import java.util.List;
import java.util.Optional;


public interface TrabajoServiceImp {
     
    public List<Trabajo> listarTrabajo();
    public void crearTrabajo(Trabajo  t);
    
    public Optional <Trabajo> buscarIdTrabajo(Long idTrabajo);
    public Trabajo editarTrabajo(Trabajo t, Long idTrabajo);
    public void eliminarTrabajo(Long idTrabajo);
    
}
