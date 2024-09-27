package com.Crudexemplo.crudusuarios.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Crudexemplo.crudusuarios.model.UsuarioModel;


@Repository
public interface UserRepository extends JpaRepository<UsuarioModel, UUID>{

}
