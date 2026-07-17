package com.inndata021.ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PersonaResponse{
    private Integer idPersona;
    private String nombre;
    private Integer edad;
    private Integer idDepartamento;
}