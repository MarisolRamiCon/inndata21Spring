package com.inndata021.ejercicio1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
/*DTO Data transfer Object, que es un modelo de como queremos mostrar los datos
DTO Request que son las entradas o los argumentos que tenga cada método
DTO Response que es la respuesta que nos va a dar los metodos */
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_persona" )
    private Integer idPersona;
    @Column(name="nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "edad")
    private Integer edad;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_departamento")
    private Departamento idDepartamento;
    
}
