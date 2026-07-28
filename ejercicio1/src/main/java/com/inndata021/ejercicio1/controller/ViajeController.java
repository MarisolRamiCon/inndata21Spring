package com.inndata021.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inndata021.ejercicio1.dto.Viaje;
import com.inndata021.ejercicio1.service.implementacion.ViajeService;

@RestController
@RequestMapping("/api/v1")
public class ViajeController {
    @Autowired
    ViajeService viajeService;
    @GetMapping("/boletos")
    public List<Viaje> readAll(){
        return viajeService.readAll();
    }
    @GetMapping("/boletos/{id}")
    public Viaje readById(@PathVariable Integer id){
        return viajeService.readById(id);
    }
    
}
