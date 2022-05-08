
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Trabajo;
import com.porfolioemanuel.porfolioEmanuel.repository.TrabajoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements TrabajoServiceImp{
    
     @Autowired
    public TrabajoRepository trabajoRepository;
     @Override
    public List<Trabajo> listarTrabajo() {
        return trabajoRepository.findAll();
    }

    @Override
    public void crearTrabajo(Trabajo t) {
       trabajoRepository.save(t);
    }
    
    
  @Override
    public Trabajo editarTrabajo(Trabajo t, Long idTrabajo) {
       
        Trabajo existeTrabajo= trabajoRepository.findById(idTrabajo).orElse(null);
        existeTrabajo.setNombreTrabajo(t.getNombreTrabajo());
        existeTrabajo.setCargoTrabajo(t.getCargoTrabajo());
        existeTrabajo.setDescTareasTrabajo(t.getDescTareasTrabajo());
        existeTrabajo.setFechaIngresoTrabajo(t.getFechaIngresoTrabajo());
        existeTrabajo.setFechaEgresoTrabajo(t.getFechaEgresoTrabajo());
        existeTrabajo.setFotoTrabajoEmpresa(t.getFotoTrabajoEmpresa());
     
        
           
        return trabajoRepository.save(existeTrabajo);
    }
    
    

    @Override
    public Optional <Trabajo> buscarIdTrabajo(Long idTrabajo) {
       return trabajoRepository.findById(idTrabajo);
        
    }

    @Override
    public void eliminarTrabajo(Long idTrabajo) {
        trabajoRepository.deleteById(idTrabajo);
    
    }


   

   

  

    
}
    