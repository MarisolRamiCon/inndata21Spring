package com.inndata021.ejercicio1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inndata021.ejercicio1.entity.Departamento;
public interface DepartamentoRepository extends JpaRepository<Departamento,Integer> {

    public List<Departamento> findByPrecioLessThan(Double precio);
    //Crea un metodo personalizado donde me digan que
    //  departamentos tienen más de 200 m2 pero valen menos de 5000
    public List<Departamento> findByPrecioLessThanAndM2GreaterThan(Double precio, Integer m2);

    //Mediante Query
    @Query(value="select * from departamento where precio>=:precio and activo=:activo;", nativeQuery = true)
    public List<Departamento> precioActivo(Double precio, Boolean activo);

}
