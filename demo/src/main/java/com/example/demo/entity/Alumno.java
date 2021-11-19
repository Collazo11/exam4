package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Pro")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String expediente;
    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "curso")
    private List<Expediente> expedientesList;
}
