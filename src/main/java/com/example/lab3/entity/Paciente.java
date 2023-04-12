package com.example.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "genero")
    private String genero;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "fecha_cita")
    private String fecha_cita;
    @Column(name = "doctor_id")
    private String doctor_id;
    @Column(name = "hospital_id")
    private String hospital_id;


}
