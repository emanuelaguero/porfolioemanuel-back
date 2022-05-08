
package com.porfolioemanuel.porfolioEmanuel.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
@Table(name="Educacion")
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEducacion;
    @Basic
    private String nombreInstitucion;
    private String nombreCurso;
    @Column(length=1000000)
    private String descActCurso;
    //@DateTimeFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private String fechaInicioCurso;
   
    private String fechaFinCurso;
    private String fotoInstitucion;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String nombreInstitucion, String nombreCurso, String descActCurso, String fechaInicioCurso, String fechaFinCurso, String fotoInstitucion) {
        this.idEducacion = idEducacion;
        this.nombreInstitucion = nombreInstitucion;
        this.nombreCurso = nombreCurso;
        this.descActCurso = descActCurso;
        this.fechaInicioCurso = fechaInicioCurso;
        this.fechaFinCurso = fechaFinCurso;
        this.fotoInstitucion = fotoInstitucion;
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescActCurso() {
        return descActCurso;
    }

    public void setDescActCurso(String descActCurso) {
        this.descActCurso = descActCurso;
    }

    public String getFechaInicioCurso() {
        return fechaInicioCurso;
    }

    public void setFechaInicioCurso(String fechaInicioCurso) {
        this.fechaInicioCurso = fechaInicioCurso;
    }

    public String getFechaFinCurso() {
        return fechaFinCurso;
    }

    public void setFechaFinCurso(String fechaFinCurso) {
        this.fechaFinCurso = fechaFinCurso;
    }

    public String getFotoInstitucion() {
        return fotoInstitucion;
    }

    public void setFotoInstitucion(String fotoInstitucion) {
        this.fotoInstitucion = fotoInstitucion;
    }





}