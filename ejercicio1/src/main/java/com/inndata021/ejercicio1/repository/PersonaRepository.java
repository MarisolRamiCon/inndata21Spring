package com.inndata021.ejercicio1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inndata021.ejercicio1.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Integer>{
    //Dos metodos personalizados, uno de palabras clave que tenga al menos una condicion
    // y el otro es por medio de @Query que tenga al menos dos condiciones
    public List<Persona> findByIdPersonaIs(Integer id);
    
}
