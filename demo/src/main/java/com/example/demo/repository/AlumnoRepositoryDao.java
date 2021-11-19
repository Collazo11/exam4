package com.example.demo.repository;
import com.example.demo.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlumnoRepositoryDao extends CrudRepository<Alumno, String>{
    @Query(value = "Select t.nombre from Expedientes ")
    public List<String> findExpedientes(Integer edad);

}
