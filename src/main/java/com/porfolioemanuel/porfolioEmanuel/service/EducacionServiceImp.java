
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Educacion;


import java.util.List;
import java.util.Optional;

public interface EducacionServiceImp {
    
    
    public List<Educacion> listarEducacion();
    public void crearEducacion(Educacion e);
    
    public Optional <Educacion> buscarIdEducacion(Long idEducaiocn);
    public Educacion editarEducacion(Educacion e, Long idEducacion);
    public void eliminarEducacion(Long idEducacion);
    
}
