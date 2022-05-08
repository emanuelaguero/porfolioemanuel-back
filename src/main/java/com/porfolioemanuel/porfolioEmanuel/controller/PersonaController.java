
package com.porfolioemanuel.porfolioEmanuel.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.porfolioemanuel.porfolioEmanuel.model.Educacion;
import com.porfolioemanuel.porfolioEmanuel.model.Persona;
import com.porfolioemanuel.porfolioEmanuel.service.PersonaServiceImp;
import java.io.File;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    private PersonaServiceImp personaServiceImp;
    //@GetMapping("/ver/persona")
    @GetMapping("lista")
    //@RequestMapping(value="/lista",method=RequestMethod.GET)
    @ResponseBody
    public List<Persona> listarPersonas(){
        return personaServiceImp.listarPersona();
    }
    
    
    
    
   @PostMapping("/crear/persona")
   public void crearPersona(@RequestBody Persona p){
     personaServiceImp.crearPersona(p);
    }

    
    
    @GetMapping("/persona/{id}")
    public Optional<Persona> buscarIdPersona(@PathVariable Long id){
        return personaServiceImp.buscarIdPersona(id);
    }
    @PutMapping("/actualizar/persona/{id}")
     public Persona editarPersona(@RequestBody Persona p,@PathVariable Long id ){
        
       return personaServiceImp.editarPersona(p,id);
    }
     @DeleteMapping("/eliminar/persona/{id}")
     public void eliminarPersona(@PathVariable Long id){
        
         personaServiceImp.eliminarPersona(id);
     }
     
     
     
     
    
}
