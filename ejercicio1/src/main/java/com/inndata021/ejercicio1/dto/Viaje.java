package com.inndata021.ejercicio1.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Viaje {
    private Integer id;
    private LocalDateTime fechaSalida;
    private String direccion;
    private Double precio;  
}
