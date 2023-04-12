package com.example.lab3_20192270.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hospiales")
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospitalid")
    private int hospitalid;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;

    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}













