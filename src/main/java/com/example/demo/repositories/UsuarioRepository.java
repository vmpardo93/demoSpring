package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}
