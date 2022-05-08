
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Persona;
import com.porfolioemanuel.porfolioEmanuel.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements PersonaServiceImp {
    @Autowired
    public PersonaRepository personaRepository;
    @Override
    public List<Persona> listarPersona() {
        return personaRepository.findAll();
    }

    @Override
    public void crearPersona(Persona p) {
        personaRepository.save(p);
    }

  

  
   @Override
    public Persona editarPersona(Persona p, Long id) {
       
        Persona existePersona= personaRepository.findById(id).orElse(null);
        existePersona.setNombre(p.getNombre());
        existePersona.setProfesion(p.getProfesion());
        existePersona.setDireccion(p.getDireccion());
        existePersona.setMail(p.getMail());
         existePersona.setTelefono(p.getTelefono());
          existePersona.setWeb(p.getWeb());
           existePersona.setLinkedin(p.getLinkedin());
        existePersona.setAcerca(p.getAcerca());
        existePersona.setFotoPerfil(p.getFotoPerfil());
        existePersona.setFotoPortada(p.getFotoPortada());
        
           
        return personaRepository.save(existePersona);
    }
    
    

    @Override
    public Optional <Persona> buscarIdPersona(Long id) {
       return personaRepository.findById(id);
        
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    
    }
   

  

    
}
    
    

    

   

    

  
    

