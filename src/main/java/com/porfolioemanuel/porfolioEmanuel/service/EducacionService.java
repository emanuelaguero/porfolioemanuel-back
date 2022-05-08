
package com.porfolioemanuel.porfolioEmanuel.service;
import com.porfolioemanuel.porfolioEmanuel.model.Educacion;
import com.porfolioemanuel.porfolioEmanuel.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements EducacionServiceImp{
    @Autowired
    public EducacionRepository educacionRepository;
    @Override
    public List<Educacion> listarEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public void crearEducacion(Educacion p) {
        educacionRepository.save(p);
    }

  

  
   @Override
    public Educacion editarEducacion(Educacion e, Long idEducacion) {
       
        Educacion existeEducacion= educacionRepository.findById(idEducacion).orElse(null);
        existeEducacion.setNombreInstitucion(e.getNombreInstitucion());
        existeEducacion.setNombreCurso(e.getNombreCurso());
        existeEducacion.setDescActCurso(e.getDescActCurso());
        existeEducacion.setFechaInicioCurso(e.getFechaInicioCurso());
        existeEducacion.setFechaFinCurso(e.getFechaFinCurso());
        existeEducacion.setFotoInstitucion(e.getFotoInstitucion());
     
        
           
        return educacionRepository.save(existeEducacion);
    }
    
    

    @Override
    public Optional <Educacion> buscarIdEducacion(Long idEducacion) {
       return educacionRepository.findById(idEducacion);
        
    }

    @Override
    public void eliminarEducacion(Long idEducacion) {
        educacionRepository.deleteById(idEducacion);
    
    }

   

   

  

    
}
    