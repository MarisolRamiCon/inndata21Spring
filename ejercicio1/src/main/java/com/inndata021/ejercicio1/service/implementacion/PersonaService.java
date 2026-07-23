package com.inndata021.ejercicio1.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inndata021.ejercicio1.dto.PersonaRequest;
import com.inndata021.ejercicio1.dto.PersonaResponse;
import com.inndata021.ejercicio1.entity.Departamento;
import com.inndata021.ejercicio1.entity.Persona;
import com.inndata021.ejercicio1.repository.DepartamentoRepository;
import com.inndata021.ejercicio1.repository.PersonaRepository;
import com.inndata021.ejercicio1.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;
    @Autowired 
    DepartamentoRepository departamentoRepository;
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
    @Override
    public PersonaResponse create(PersonaRequest persona) {
        Persona personaACrear= new Persona();
        personaACrear.setNombre(persona.getNombre());
        personaACrear.setDireccion(persona.getDireccion());
        personaACrear.setEdad(persona.getEdad());
        Departamento departamento=departamentoRepository.findById(persona.getIdDepartamento()).orElse(null);
        personaACrear.setIdDepartamento(departamento);
        //Guardar en el repositorio
        personaRepository.save(personaACrear);
        //Ahora se crea la respuesta
        PersonaResponse personaResponse= new PersonaResponse();
        personaResponse.setIdPersona(personaACrear.getIdPersona());
        personaResponse.setNombre(personaACrear.getNombre());
        //edad idDepartamento
        personaResponse.setEdad(personaACrear.getEdad());
        if(personaACrear.getIdDepartamento()!=null){
            personaResponse.setIdDepartamento(personaACrear.getIdDepartamento().getId());

        }
        
        return personaResponse;
       }
    
}
