package com.inndata021.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inndata021.ejercicio1.dto.PersonaResponse;

import com.inndata021.ejercicio1.service.implementacion.PersonaService;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/personas")
    public List<PersonaResponse> readAll(){
        return personaService.readAll();
    }
    
}
