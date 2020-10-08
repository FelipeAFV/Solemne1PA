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
    
    
    public Vendedor(String rut, String nombre, double sueldo_base) {
        super(rut, nombre, sueldo_base);
    }

    @Override
    public double getSueldo_base() {
        return super.getSueldo_base() + ventas_mes*10000;
    }
    
    
}
