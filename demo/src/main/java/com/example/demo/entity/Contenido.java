package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Contenidos")

public class Contenido {
    private String nombre;
    private String descripcion;
    private  Integer duracion;


    public Integer getDuracion() {
        return duracion;
    }
}
