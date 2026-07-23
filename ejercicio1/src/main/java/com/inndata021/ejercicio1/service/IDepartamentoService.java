package com.inndata021.ejercicio1.service;

import java.util.List;

import com.inndata021.ejercicio1.dto.DepartamentoResponse;
import com.inndata021.ejercicio1.entity.Departamento;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Departamento reabById(Integer id);
    public Departamento create(Departamento departamento);
    public Departamento updateById(Integer id, Departamento departamento);
    //borrado lógico
    public String deleteById(Integer id);
    //Metodos personalizados
    //Buscar departamentos que cuesten menos de 4000 pesos
    public List<DepartamentoResponse> departamentosBaratos(Double precio);
    public List<DepartamentoResponse> precioAndM2(Double precio, Integer m2);
    public List<Departamento> precioActivo(Double precio, Boolean activo);
}
