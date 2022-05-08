/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolioemanuel.porfolioEmanuel.service;

import com.porfolioemanuel.porfolioEmanuel.model.Educacion;
import com.porfolioemanuel.porfolioEmanuel.model.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author sergi
 */
public interface PersonaServiceImp {
    public List<Persona> listarPersona();
    
    public void crearPersona(Persona p);
    
    public Optional <Persona> buscarIdPersona(Long id);
    public Persona editarPersona(Persona p, Long id);
    public void eliminarPersona(Long id);
}
