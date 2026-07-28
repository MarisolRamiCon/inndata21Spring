package com.inndata021.ejercicio1.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.inndata021.ejercicio1.dto.Viaje;

//Vamos a vincular nuestra api de terceros con el proyecto
@FeignClient(name = "tickets", url = "https://6721642e98bbb4d93ca84a26.mockapi.io/api/v4")
public interface ViajeRepository {
    @GetMapping("/tickets")
    public List<Viaje> readAll();
    @GetMapping("/tickets/{id}")
    public Viaje readById(@PathVariable Integer id);
    
}
