/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.LinkedList;

/**
 *
 * @author f_fig
 */
public class Empresa {
    LinkedList<Vendedor> vendedores;
    LinkedList<Administrativo> administrativos;
    LinkedList<Obrero> obreros;
    LinkedList<ResponsableRRHH> rec_humanos;
    Gerente gerente;

    public Empresa() {
        this.vendedores = new LinkedList<>();
        this.administrativos = new LinkedList<>();
        this.obreros = new LinkedList<>();
        this.rec_humanos = new LinkedList<>();
    }
    
    public static void main(String[] args) {
        
    }
    
    
}
