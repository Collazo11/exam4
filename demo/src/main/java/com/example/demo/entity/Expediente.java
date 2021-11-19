package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expedientes")

public class Expediente {

    private Date fechaInsc;
    private Integer calificacion;
    private Date fechFin;
    private Curso curso;

}
