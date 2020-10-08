/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author f_fig
 */
public class ResponsableRRHH extends Administrativo {

    public ResponsableRRHH(String rut, String nombre, double sueldo_base, String cargo) {
        super(rut, nombre, sueldo_base, cargo);
    }

    public void agregar_administrativos(Empresa empresa, Empleado emp) {
        empresa.administrativos.add((Administrativo) emp);
    }

    public void modificar_administrativos(Empresa empresa, String rut) {
        int accion = Integer.parseInt(JOptionPane.showInputDialog("accion"));
        switch (accion) {
            case 0:
                //Eliminar
                break;
            case 1:
                //Modificar
                break;
        }
    }

    public void agregar_obrero(Empresa empresa, Empleado emp) {
        empresa.obreros.add((Obrero) emp);
    }

    public void modificar_obreros(Empresa empresa, String rut) {
        int accion = Integer.parseInt(JOptionPane.showInputDialog("accion"));
        switch (accion) {
            case 0:
                //Eliminar
                break;
            case 1:
                //Modificar
                break;
        }
    }

    public void agregar_vendedor(Empresa empresa, Empleado emp) {
        empresa.vendedores.add((Vendedor) emp);
    }

    public void modificar_vendedores(Empresa empresa, String rut) {
        int accion = Integer.parseInt(JOptionPane.showInputDialog("accion"));
        switch (accion) {
            case 0:
                //Eliminar
                break;
            case 1:
                //Modificar
                break;
        }
    }
}
