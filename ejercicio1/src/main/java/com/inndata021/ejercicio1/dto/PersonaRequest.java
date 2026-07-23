package com.inndata021.ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonaRequest {
    private String nombre;
    private String direccion;
    private Integer edad;
    private Integer idDepartamento;
}
