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
public class Empleado {
    
    private String rut;
    private String nombre;
    private String apellido;
    private String niveEducativo;
    private double sueldo;
    
    public Empleado(String rut, String nombre,double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(String rut, String nombre, String apellido, String niveEducativo, double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.niveEducativo = niveEducativo;
        this.sueldo = sueldo;
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

    public String getNiveEducativo() {
        return niveEducativo;
    }

    public void setNiveEducativo(String niveEducativo) {
        this.niveEducativo = niveEducativo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
