package com.inndata021.ejercicio1.service;

import java.util.List;

import com.inndata021.ejercicio1.dto.Viaje;

public interface IViajeService {
    public List<Viaje> readAll();
    public Viaje readById(Integer id);

    
}