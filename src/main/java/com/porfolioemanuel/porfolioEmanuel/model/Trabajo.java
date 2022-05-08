/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolioemanuel.porfolioEmanuel.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Trabajo")
@Entity
public class Trabajo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTrabajo;
    @Basic
    private String nombreTrabajo;
    private String cargoTrabajo;
    @Column(length=1000000)
    private String descTareasTrabajo;
    //@DateTimeFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private String fechaIngresoTrabajo;
   
    private String fechaEgresoTrabajo;
    private String fotoTrabajoEmpresa;

    public Trabajo() {
    }

    public Trabajo(Long idTrabajo, String nombreTrabajo, String cargoTrabajo, String descTareasTrabajo, String fechaIngresoTrabajo, String fechaEgresoTrabajo, String fotoTrabajoEmpresa) {
        this.idTrabajo = idTrabajo;
        this.nombreTrabajo = nombreTrabajo;
        this.cargoTrabajo = cargoTrabajo;
        this.descTareasTrabajo = descTareasTrabajo;
        this.fechaIngresoTrabajo = fechaIngresoTrabajo;
        this.fechaEgresoTrabajo = fechaEgresoTrabajo;
        this.fotoTrabajoEmpresa = fotoTrabajoEmpresa;
    }

    public Long getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Long idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public String getCargoTrabajo() {
        return cargoTrabajo;
    }

    public void setCargoTrabajo(String cargoTrabajo) {
        this.cargoTrabajo = cargoTrabajo;
    }

    public String getDescTareasTrabajo() {
        return descTareasTrabajo;
    }

    public void setDescTareasTrabajo(String descTareasTrabajo) {
        this.descTareasTrabajo = descTareasTrabajo;
    }

    public String getFechaIngresoTrabajo() {
        return fechaIngresoTrabajo;
    }

    public void setFechaIngresoTrabajo(String fechaIngresoTrabajo) {
        this.fechaIngresoTrabajo = fechaIngresoTrabajo;
    }

    public String getFechaEgresoTrabajo() {
        return fechaEgresoTrabajo;
    }

    public void setFechaEgresoTrabajo(String fechaEgresoTrabajo) {
        this.fechaEgresoTrabajo = fechaEgresoTrabajo;
    }

    public String getFotoTrabajoEmpresa() {
        return fotoTrabajoEmpresa;
    }

    public void setFotoTrabajoEmpresa(String fotoTrabajoEmpresa) {
        this.fotoTrabajoEmpresa = fotoTrabajoEmpresa;
    }

    
    
    
}