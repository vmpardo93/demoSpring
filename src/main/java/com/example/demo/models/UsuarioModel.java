package com.example.demo.models;
import java.time.LocalDate;
import java.time.Period;
import javax.persistence.*;

import org.apache.commons.lang3.time.DateFormatUtils;
@Entity
@Table (name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private String fechaNacimiento;
    private String fechaVinculacion;
    private String cargo;
    private float salario;
    private String tiempovinculacion;
    private String edad;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }
    public void setFechaVinculacion(String fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(float edad) {
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        this.edad = "Edad:"+ periodo.getYears() +"/"+ periodo.getMonths() +"/"+ periodo.getDays();
    }
    public String getTiempovinculacion() {
        return tiempovinculacion;
    }
    public void setTiempovinculacion(float tiempovinculacion) { 
        LocalDate fechaVin = LocalDate.parse(fechaVinculacion);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaVin, ahora);
        this.tiempovinculacion = "Tiempo con la empresa:"+ periodo.getYears() +"/"+ periodo.getMonths() +"/"+ periodo.getDays();
    }
    

}
