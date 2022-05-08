
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Proyecto;
import com.porfolioemanuel.porfolioEmanuel.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements ProyectoServiceImp{
    @Autowired
    public ProyectoRepository proyectoRepository;
    @Override
    public List<Proyecto> listarProyecto() {
        return proyectoRepository.findAll();
    }

    @Override
    public void crearProyecto(Proyecto p) {
       proyectoRepository.save(p);
    }
    
    
  @Override
    public Proyecto editarProyecto(Proyecto p, Long idProyecto) {
       
        Proyecto existeProyecto= proyectoRepository.findById(idProyecto).orElse(null);
        existeProyecto.setNombreProyecto(p.getNombreProyecto());
        existeProyecto.setDescProyecto(p.getDescProyecto()); 
        existeProyecto.setUrlProyecto(p.getUrlProyecto());
     
        
           
        return proyectoRepository.save(existeProyecto);
    }
    
    

    @Override
    public Optional <Proyecto> buscarIdProyecto(Long idProyecto) {
       return proyectoRepository.findById(idProyecto);
        
    }

    @Override
    public void eliminarProyecto(Long idProyecto) {
        proyectoRepository.deleteById(idProyecto);
    
    }


   

   

  

    
}
    