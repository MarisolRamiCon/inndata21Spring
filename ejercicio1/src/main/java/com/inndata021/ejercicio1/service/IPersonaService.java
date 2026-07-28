package com.inndata021.ejercicio1.service;

import java.util.List;

import com.inndata021.ejercicio1.dto.PersonaRequest;
import com.inndata021.ejercicio1.dto.PersonaResponse;
import com.inndata021.ejercicio1.entity.Persona;

public interface IPersonaService {
    public List<PersonaResponse> readAll();
    public PersonaResponse create(PersonaRequest persona);
    public List<Persona> findByIdIs(Integer id);
}
