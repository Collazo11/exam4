package com.example.demo.repository;

import com.example.demo.entity.Alumno;
import com.example.demo.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepositoryDao extends CrudRepository<Curso, String> {
}