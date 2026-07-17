package com.inndata021.ejercicio1.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inndata021.ejercicio1.dto.PersonaResponse;
import com.inndata021.ejercicio1.repository.PersonaRepository;
import com.inndata021.ejercicio1.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<PersonaResponse> readAll() {
        return personaRepository.findAll().stream().map(persona->
            {
                PersonaResponse personaResponse= new PersonaResponse();
                personaResponse.setIdPersona(persona.getIdPersona());
                personaResponse.setNombre(persona.getNombre());
                personaResponse.setEdad(persona.getEdad());
                personaResponse.setIdDepartamento(persona.getIdDepartamento().getId());
                return personaResponse;
            }
        ).toList();
        
    }
    
}
