/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author f_fig
 */
public abstract class Empleado {
    
    private String rut;
    private String nombre;
    private String apellido;
    private String nivel_educativo;
    private double sueldo_base;
    
    public Empleado(String rut, String nombre,double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.sueldo_base = sueldo;
    }

    public Empleado(String rut, String nombre, String apellido, String nive_educativo, double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel_educativo = nive_educativo;
        this.sueldo_base = sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }



   
    
    
    
}
