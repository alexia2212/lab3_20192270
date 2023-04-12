package com.example.lab3_20192270.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctores")
public class DoctoresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctorid")
    private int doctorid;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "especialidad")
    private String especialidad;

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}