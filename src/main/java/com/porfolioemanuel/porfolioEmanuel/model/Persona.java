
 package com.porfolioemanuel.porfolioEmanuel.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Persona")
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private String profesion;
    private String direccion;
    private String mail;
    private String telefono;
    private String web;
    private String linkedin;
    //@Column(columnDefinition="TEXT")
    @Column(length=1000000)
    private String acerca;
    private String fotoPerfil;
    private String fotoPortada;

    public Persona() {
    }

    public Persona(Long id, String nombre, String profesion, String direccion, String mail, String telefono, String web, String linkedin, String acerca, String fotoPerfil, String fotoPortada) {
        this.id = id;
        this.nombre = nombre;
        this.profesion = profesion;
        this.direccion = direccion;
        this.mail = mail;
        this.telefono = telefono;
        this.web = web;
        this.linkedin = linkedin;
        this.acerca = acerca;
        this.fotoPerfil = fotoPerfil;
        this.fotoPortada = fotoPortada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getFotoPortada() {
        return fotoPortada;
    }

    public void setFotoPortada(String fotoPortada) {
        this.fotoPortada = fotoPortada;
    }





}