package com.example.demo.Service;
import com.example.demo.entity.Alumno;
import com.example.demo.entity.Curso;
import com.example.demo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepo;

    public void AddCurso(Curso curso){
        cursoRepo.creacionCurso(curso);
    }

    public List<Curso> getLista() {
        return null;
    }
}
