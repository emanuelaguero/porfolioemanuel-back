
package com.porfolioemanuel.porfolioEmanuel.controller;

import com.porfolioemanuel.porfolioEmanuel.model.Trabajo;
import com.porfolioemanuel.porfolioEmanuel.service.TrabajoServiceImp;
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
public class TrabajoController {
    @Autowired
    private TrabajoServiceImp trabajoServiceImp;
    //@GetMapping("/ver/persona")
    @GetMapping("/listartrabajo")
    @ResponseBody
    public List<Trabajo> listarTrabajo(){
        return trabajoServiceImp.listarTrabajo();
    }
    
    
    
    
    
   @PostMapping("/crear/trabajo")
   public void crearTrabajo(@RequestBody Trabajo t){
     trabajoServiceImp.crearTrabajo(t);
    }

    
    
    @GetMapping("/trabajo/{id}")
    public Optional<Trabajo> buscarIdTrabajo(@PathVariable Long id){
        return trabajoServiceImp.buscarIdTrabajo(id);
    }
    @PutMapping("/actualizar/trabajo/{id}")
     public Trabajo editarEducacion(@RequestBody Trabajo t,@PathVariable Long id ){
        
       return trabajoServiceImp.editarTrabajo(t,id);
    }
     @DeleteMapping("/eliminar/trabajo/{id}")
     public void eliminarTrabajo(@PathVariable Long id){
        
         trabajoServiceImp.eliminarTrabajo(id);
     }
     
     




}
        
        
        
        
        
