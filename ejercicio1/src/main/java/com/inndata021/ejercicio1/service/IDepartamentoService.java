package com.inndata021.ejercicio1.service;

import java.util.List;

import com.inndata021.ejercicio1.entity.Departamento;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Departamento reabById(Integer id);
    public Departamento create(Departamento departamento);
}
