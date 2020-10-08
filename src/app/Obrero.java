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
public class Obrero extends Empleado {
    
    private double multiplicador_turno;
    private double horas_extra;
    private String tipo_turno;
    
    public Obrero(String rut, String nombre, double sueldo_base, double multiplciador_turno,
            double horas_extra, String tipo_turno){
        super(rut, nombre, sueldo_base);
        this.horas_extra = horas_extra;
        this.multiplicador_turno = multiplciador_turno;
        this.tipo_turno = tipo_turno;
    }
    
    public double sueldo_final(){
        double sueldo = this.get_sueldo_base();
        sueldo = sueldo * this.multiplicador_turno;
        sueldo = sueldo + (this.horas_extra)*10000;
        return sueldo;
    }
    
    public double get_horas_extra(){
        return this.horas_extra;
    }
    
    public double get_multiplicador_turno(){
        return this.multiplicador_turno;
    }

    public String get_tipo_turno() {
        return tipo_turno;
    }

    public void set_tipo_turno(String tipo_turno) {
        this.tipo_turno = tipo_turno;
    }
    
    
    
    
    
}
