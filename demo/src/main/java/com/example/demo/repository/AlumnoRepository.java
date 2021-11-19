package com.example.demo.repository;
import com.example.demo.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlumnoRepository {

    @Autowired

    AlumnoRepositoryDao alumnoRepositoryDao;

    public void creacionAlumno(Alumno alumno){alumnoRepositoryDao.save(alumno);}

}

