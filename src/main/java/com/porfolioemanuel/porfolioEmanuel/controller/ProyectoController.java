
package com.porfolioemanuel.porfolioEmanuel.controller;

import com.porfolioemanuel.porfolioEmanuel.model.Proyecto;
import com.porfolioemanuel.porfolioEmanuel.service.ProyectoServiceImp;
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
public class ProyectoController {
    @Autowired
    private ProyectoServiceImp proyectoServiceImp;
    //@GetMapping("/ver/persona")
    @GetMapping("/listarproyecto")
    @ResponseBody
    public List<Proyecto> listarProyecto(){
        return proyectoServiceImp.listarProyecto();
    }
    
    
    
    
    
   @PostMapping("/crear/proyecto")
   public void crearProyecto(@RequestBody Proyecto p){
     proyectoServiceImp.crearProyecto(p);
    }

    
    
    @GetMapping("/proyecto/{id}")
    public Optional<Proyecto> buscarIdProyecto(@PathVariable Long id){
        return proyectoServiceImp.buscarIdProyecto(id);
    }
    @PutMapping("/actualizar/proyecto/{id}")
     public Proyecto editarProyecto(@RequestBody Proyecto p,@PathVariable Long id ){
        
       return proyectoServiceImp.editarProyecto(p,id);
    }
     @DeleteMapping("/eliminar/proyecto/{id}")
     public void eliminarProyecto(@PathVariable Long id){
        
         proyectoServiceImp.eliminarProyecto(id);
     }
     
     




}

        