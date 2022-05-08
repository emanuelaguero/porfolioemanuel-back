
package com.porfolioemanuel.porfolioEmanuel.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Proyecto")
@Entity
public class Proyecto {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;
    @Basic
    private String nombreProyecto;
    @Column(length=1000000)
    private String descProyecto;
    private String urlProyecto;

    public Proyecto() {
    }

    public Proyecto(Long idProyecto, String nombreProyecto, String descProyecto, String urlProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descProyecto = descProyecto;
        this.urlProyecto = urlProyecto;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescProyecto() {
        return descProyecto;
    }

    public void setDescProyecto(String descProyecto) {
        this.descProyecto = descProyecto;
    }

    public String getUrlProyecto() {
        return urlProyecto;
    }

    public void setUrlProyecto(String urlProyecto) {
        this.urlProyecto = urlProyecto;
    }
    
    
    
    
}