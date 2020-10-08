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

    public String get_rut() {
        return rut;
    }

    public void set_rut(String rut) {
        this.rut = rut;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String get_apellido() {
        return apellido;
    }

    public void set_apellido(String apellido) {
        this.apellido = apellido;
    }

    public String get_nivel_educativo() {
        return nivel_educativo;
    }

    public void set_nivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public double get_sueldo_base() {
        return sueldo_base;
    }

    public void set_sueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }



   
    
    
    
}
