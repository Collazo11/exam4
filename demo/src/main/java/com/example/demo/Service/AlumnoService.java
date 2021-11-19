package com.example.demo.Service;

import com.example.demo.entity.Alumno;
import com.example.demo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository AlumnoRepo;

    public void AddAlumno(Alumno alumno){
        AlumnoRepo.creacionAlumno(alumno);
    }

    public List<Alumno> getLista() {
        return null;
    }

    public Alumno getAlumno(String nombre) {
        return null;
    }
}
