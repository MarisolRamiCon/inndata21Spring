package com.inndata021.ejercicio1.service.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inndata021.ejercicio1.entity.Departamento;
import com.inndata021.ejercicio1.repository.DepartamentoRepository;

import com.inndata021.ejercicio1.dto.DepartamentoResponse;
import com.inndata021.ejercicio1.service.IDepartamentoService;
@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired //Inyeccion de dependencia
    DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll().stream().filter(departamento-> departamento.getActivo()).toList();
    }
    @Override
    public Departamento reabById(Integer id) {
        return departamentoRepository.findById(id).orElse(null);   
    }
    @Override
    public Departamento create(Departamento departamento) {
        departamento.setActivo(true);
        return departamentoRepository.save(departamento);

    }
    @Override
    public Departamento updateById(Integer id,Departamento departamento) {
        Optional<Departamento> departamentoActualizar= departamentoRepository.findById(id);
        if(departamentoActualizar.isPresent()){
            Departamento departamento2=departamentoActualizar.get();
            departamento2.setM2(departamento.getM2());
            departamento2.setPrecio(departamento.getPrecio());
            departamentoRepository.save(departamento2);
            return departamento2;
        }else{
            return new Departamento();
        }
        
    }
    @Override
    public String deleteById(Integer id) {
        Optional<Departamento> departamentoABorrar= departamentoRepository.findById(id);
        if(departamentoABorrar.isPresent()){
            Departamento departamento= departamentoABorrar.get();
            departamento.setActivo(false);
            departamentoRepository.save(departamento);
            return "Departamento borrado";
        }else{
            return "Departamento no encontrado";
        }
    }
    @Override
    public List<DepartamentoResponse> departamentosBaratos(Double precio) {
       return departamentoRepository.findByPrecioLessThan(precio).stream().map(
        departamento ->{
            //Instancias un DepartamentoResponse
            DepartamentoResponse departamentoResponse= new DepartamentoResponse();
            departamentoResponse.setId(departamento.getId());
            departamentoResponse.setM2(departamento.getM2());
            departamentoResponse.setPrecio(departamento.getPrecio());
            return departamentoResponse;
        }
       ).toList();
    }

    @Override
    public List<DepartamentoResponse> precioAndM2(Double precio, Integer m2){
        return departamentoRepository.findByPrecioLessThanAndM2GreaterThan(precio, m2).stream().map(
            departamento -> {
                DepartamentoResponse departamentoResponse= new DepartamentoResponse();
            departamentoResponse.setId(departamento.getId());
            departamentoResponse.setM2(departamento.getM2());
            departamentoResponse.setPrecio(departamento.getPrecio());
            return departamentoResponse;
            }
        ).toList();
    }
    @Override
    public List<Departamento> precioActivo(Double precio, Boolean activo) {
        return departamentoRepository.precioActivo(precio, activo);
    }
    
    
    
}
