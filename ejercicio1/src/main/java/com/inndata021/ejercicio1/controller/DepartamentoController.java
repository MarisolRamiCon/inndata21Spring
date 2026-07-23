package com.inndata021.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inndata021.ejercicio1.dto.DepartamentoResponse;
import com.inndata021.ejercicio1.entity.Departamento;
import com.inndata021.ejercicio1.service.implementacion.DepartamentoService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1")

public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;
    /*peticiones del protocolo REST
    get para leer, post para crear, put para actualizar y delete es para borrar */
    @GetMapping("/departamentos")
    public List<Departamento> readAll(){
        return departamentoService.readAll();
    }

    @GetMapping("/departamentos/{id}")
    public Departamento readById(@PathVariable Integer id){
        return departamentoService.reabById(id);
    }

    @PostMapping("/departamentos")
    public Departamento create(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }

    @PutMapping("/departamentos")
    public Departamento updateById(@PathParam("id") Integer id, @RequestBody Departamento departamento){
        return departamentoService.updateById(id, departamento);
    }

    @DeleteMapping("/departamentos")
    public String deleteById(@PathParam("id") Integer id){
        return departamentoService.deleteById(id);
    }

   @GetMapping("/departamentosPrecio")
   public List<DepartamentoResponse> departamentosBaratos(@PathParam("precio") Double precio){
        return departamentoService.departamentosBaratos(precio);
   } 

   @GetMapping("/precioAndM2")
   public List<DepartamentoResponse> precioAndM2(@PathParam("precio") Double precio,@PathParam("m2") Integer m2){
        return departamentoService.precioAndM2(precio, m2);
   }

   @GetMapping("/precioActivo")
   public List<Departamento> precioActivo(@PathParam("precio") Double precio, @PathParam("activo") Boolean activo){
    return departamentoService.precioActivo(precio, activo);
   }
    
}
