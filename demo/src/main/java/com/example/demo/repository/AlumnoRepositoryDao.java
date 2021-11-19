package com.example.demo.repository;
import com.example.demo.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepositoryDao extends CrudRepository<Alumno, String>{
}
