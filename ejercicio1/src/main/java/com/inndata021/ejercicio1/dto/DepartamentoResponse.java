package com.inndata021.ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class DepartamentoResponse {
    private Integer id;
    private Integer m2;
    private Double precio;   
}
