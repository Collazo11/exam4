package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Pro")

public class Curso {
    List<Contenido> contenidosList;
}
