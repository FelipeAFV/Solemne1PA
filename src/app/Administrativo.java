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
public class Administrativo extends Empleado {
    
    
    private String cargo;
    
    public Administrativo(String rut, String nombre, double sueldo_base, String cargo) {
        super(rut, nombre, sueldo_base);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
