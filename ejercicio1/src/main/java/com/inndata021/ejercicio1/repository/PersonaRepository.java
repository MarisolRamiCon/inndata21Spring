package com.inndata021.ejercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inndata021.ejercicio1.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Integer>{
    
    
}
