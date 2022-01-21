package com.example.demo.models;
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
    private DateFormatUtils fechaNacimiento;
    private DateFormatUtils fechaVinculacion;
    private String cargo;
    private float salario;

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
    public DateFormatUtils getFechaVinculacion() {
        return fechaVinculacion;
    }
    public void setFechaVinculacion(DateFormatUtils fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }
    public DateFormatUtils getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(DateFormatUtils fechaNacimiento) {
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
    

}
