
package com.porfolioemanuel.porfolioEmanuel.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Habilidad")
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidad;
    @Basic
    private String nombreHabilidad;
    private String porcHabilidad;
    private String nivelHabilidad;

    public String getNivelHabilidad() {
        return nivelHabilidad;
    }

    public void setNivelHabilidad(String nivelHabilidad) {
        this.nivelHabilidad = nivelHabilidad;
    }

    public Habilidad(String nivelHabilidad) {
        this.nivelHabilidad = nivelHabilidad;
    }

    public Habilidad() {
    }

    public Habilidad(Long idHabilidad, String nombreHabilidad, String porcHabilidad) {
        this.idHabilidad = idHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.porcHabilidad = porcHabilidad;
    }

    public Long getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(Long idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public String getPorcHabilidad() {
        return porcHabilidad;
    }

    public void setPorcHabilidad(String porcHabilidad) {
        this.porcHabilidad = porcHabilidad;
    }

    
    
    
}
