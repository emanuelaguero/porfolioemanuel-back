
package com.porfolioemanuel.porfolioEmanuel.controller;

import com.porfolioemanuel.porfolioEmanuel.model.Educacion;
import com.porfolioemanuel.porfolioEmanuel.service.EducacionServiceImp;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired
    private EducacionServiceImp educacionServiceImp;
    //@GetMapping("/ver/persona")
    @GetMapping("/listar")
    @ResponseBody
    public List<Educacion> listarEducacion(){
        return educacionServiceImp.listarEducacion();
    }
    
    
    
    
    
   @PostMapping("/crear/educacion")
   public void crearEducacion(@RequestBody Educacion e){
     educacionServiceImp.crearEducacion(e);
    }

    
    
    @GetMapping("/educacion/{id}")
    public Optional<Educacion> buscarIdEducacion(@PathVariable Long id){
        return educacionServiceImp.buscarIdEducacion(id);
    }
    @PutMapping("/actualizar/educacion/{id}")
     public Educacion editarEducacion(@RequestBody Educacion e,@PathVariable Long id ){
        
       return educacionServiceImp.editarEducacion(e,id);
    }
     @DeleteMapping("/eliminar/educacion/{id}")
     public void eliminarEducacion(@PathVariable Long id){
        
         educacionServiceImp.eliminarEducacion(id);
     }
     
     




}
        
        
        
        
        

