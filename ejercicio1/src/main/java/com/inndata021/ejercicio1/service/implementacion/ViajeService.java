package com.inndata021.ejercicio1.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inndata021.ejercicio1.dto.Viaje;
import com.inndata021.ejercicio1.repository.ViajeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ViajeService {
    @Autowired
    ViajeRepository viajeRepository;

    public List<Viaje> readAll(){
        log.info("Estamos en el metodo ReadAll de viaje");
        return viajeRepository.readAll();
        
    }

    public Viaje readById(Integer id){
        log.info("Estamos en el metodo ReadById de viaje");
        try{
        return viajeRepository.readById(id);
        }catch(Exception ex){
            log.error(ex.getMessage());
            return new Viaje();
        }
    }
    
}
