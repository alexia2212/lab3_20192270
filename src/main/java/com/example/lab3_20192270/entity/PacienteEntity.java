package com.example.lab3_20192270.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pacientes")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pacienteid")
    private int pacienteid;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "genero")
    private String genero;

    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "fecha_cita")
    private int fecha_cita;
    @Column(name = "nro_habitacion")
    private int nro_habitacion;
    @Column(name = "doctorid")
    private int doctorid;
    @Column(name = "hospitalid")
    private int hospitalid;

    public int getPacienteid() {
        return pacienteid;
    }

    public void setPacienteid(int pacienteid) {
        this.pacienteid = pacienteid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(int fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getNro_habitacion() {
        return nro_habitacion;
    }

    public void setNro_habitacion(int nro_habitacion) {
        this.nro_habitacion = nro_habitacion;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }
}