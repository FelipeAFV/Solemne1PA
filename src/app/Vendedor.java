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
public class Vendedor extends Empleado {
    
    private String area_asignada;
    private int ventas_mes;
    
    
    public Vendedor(String rut, String nombre, double sueldo_base, String area_asignada, int ventas_mes) {
        super(rut, nombre, sueldo_base);
        this.area_asignada = area_asignada;
        this.ventas_mes = ventas_mes;
    }

    public double get_sueldo_final() {
        return get_sueldo_base() + ventas_mes*10000;
    }

    public String get_area_asignada() {
        return area_asignada;
    }

    public void set_area_asignada(String area_asignada) {
        this.area_asignada = area_asignada;
    }

    public int get_ventas_mes() {
        return ventas_mes;
    }

    public void set_ventas_mes(int ventas_mes) {
        this.ventas_mes = ventas_mes;
    }

    @Override
    public String toString() {
        return super.toString() + "\n[Vendedor : Sueldo final: "+ get_sueldo_final() + " Area asignada: "+ area_asignada +
                " Ventas mensuales: " + ventas_mes+ "]";
    }
    
    
    
}
