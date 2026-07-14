package com.inndata021.ejercicio1.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inndata021.ejercicio1.entity.Departamento;
import com.inndata021.ejercicio1.repository.DepartamentoRepository;
import com.inndata021.ejercicio1.service.IDepartamentoService;
@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired //Inyeccion de dependencia
    DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll();
    }
    @Override
    public Departamento reabById(Integer id) {
        return departamentoRepository.findById(id).orElse(null);   
    }
    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
    
    
}
