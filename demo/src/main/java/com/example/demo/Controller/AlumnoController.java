package com.example.demo.Controller;

import com.example.demo.Service.AlumnoService;
import com.example.demo.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @PostMapping
    public ResponseEntity<Alumno> addStudent(@RequestBody Alumno student) {
        System.out.println("Se hizo la solicitud");
        service.AddAlumno(student);
        return ResponseEntity.ok(student);

    }
//    @GetMapping("/{pornombre}/{nombrevariable}")
//    public Alumno getAlumnoByName(@PathVariable("nombrevariable") String Nombre) {
//        return service.getAlumno(nombre);
//    }

}
