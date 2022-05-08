
package com.porfolioemanuel.porfolioEmanuel.controller;

import com.porfolioemanuel.porfolioEmanuel.model.Habilidad;
import com.porfolioemanuel.porfolioEmanuel.service.HabilidadServiceImp;
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
public class HabilidadController {
  

  @Autowired
    private HabilidadServiceImp habilidadServiceImp;
    //@GetMapping("/ver/persona")
    @GetMapping("/listarhabilidad")
    @ResponseBody
    public List<Habilidad> listarHabilidad(){
        return habilidadServiceImp.listarHabilidad();
    }
    
    
    
    
    
   @PostMapping("/crear/habilidad")
   public void crearhabilidad(@RequestBody Habilidad h){
     habilidadServiceImp.crearHabilidad(h);
    }

    
    
    @GetMapping("/habilidad/{id}")
    public Optional<Habilidad> buscarIdHabilidad(@PathVariable Long id){
        return habilidadServiceImp.buscarIdHabilidad(id);
    }
   @PutMapping("/actualizar/habilidad/{id}")
     public Habilidad editarHabilidad(@RequestBody Habilidad h,@PathVariable Long id ){
        
       return habilidadServiceImp.editarHabilidad(h,id);
    }
     
     @DeleteMapping("/eliminar/habilidad/{id}")
     public void eliminarEducacion(@PathVariable Long id){
        
         habilidadServiceImp.eliminarHabilidad(id);
     }
     
     




}
        
        
        
        
        