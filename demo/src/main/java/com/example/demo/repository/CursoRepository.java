package com.example.demo.repository;

import com.example.demo.entity.Alumno;
import com.example.demo.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepository {

    @Autowired

    CursoRepositoryDao cursoRepositoryDao;

    public void creacionCurso(Curso curso){cursoRepositoryDao.save(curso);}

}