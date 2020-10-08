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
    ResponsableRRHH rec_humanos;
    Gerente gerente;

    public Empresa() {
        this.vendedores = new LinkedList<>();
        this.administrativos = new LinkedList<>();
        this.obreros = new LinkedList<>();
    }

    public static void main(String[] args) {
        //Se crea la empresa
        Empresa enterprise = new Empresa();

        //Se crea gerente de la empresa
        Gerente gerente_empresa = new Gerente("15586336-4-7", "Fred", 500.000, "Gerente");

        //Se crea Resposable de RRHH
        ResponsableRRHH resp = new ResponsableRRHH("54877236-4-7", "Juan", 250.000, "Administrador RRHH");

        //Se enrola Gerente en la empresa
        enterprise.añadir_Gerente(gerente_empresa);

        //Se enrola Resposable de RRHH
        enterprise.añadir_RRHH(resp);

        //Se crean administrativos
        Administrativo contador1 = new Administrativo("13277826-4-7", "Denisse", 300.000, "Contador");
        Administrativo asistente1 = new Administrativo("13277826-4-7", "Denisse", 300.000, "Asistente");

        //Se enrolan administrativos a empresa
        resp.agregar_administrativos(enterprise, contador1);
        resp.agregar_administrativos(enterprise, asistente1);

        //Se añaden vendedores a la empresa
        resp.agregar_vendedor(enterprise, new Vendedor("7005044-7", "Roberto", 50.000, "Metropolitana", 12));
        resp.agregar_vendedor(enterprise, new Vendedor("8512646-6", "Jean", 50.000, "Metropolitana", 13));
        resp.agregar_vendedor(enterprise, new Vendedor("5302870-5", "Pedro", 50.000, "Norte", 9));
        resp.agregar_vendedor(enterprise, new Vendedor("16319006-0", "Diego", 50.000, "Sur", 10));

        //Se añaden obreros a la empresa
        resp.agregar_obrero(enterprise, new Obrero("19785911-3", "Juan", 20.000, 1.1, 4, "Primer turno"));
        resp.agregar_obrero(enterprise, new Obrero("18040131-8", "Carlos", 20.000, 1.3, 6, "Primer turno"));
        resp.agregar_obrero(enterprise, new Obrero("6129670-0", "Mario", 20.000, 1.4, 7, "Segundo turno"));
        resp.agregar_obrero(enterprise, new Obrero("14463144-7", "Ruben", 20.000, 1.6, 5, "Segundo turno"));
        resp.agregar_obrero(enterprise, new Obrero("14578502-2", "Fabricio", 20.000, 1.2, 3, "Tercer turno"));
        resp.agregar_obrero(enterprise, new Obrero("21376139-0", "Ignacio", 20.000, 1.5, 5, "Tercer turno"));
        
        

    }

    public void añadir_RRHH(ResponsableRRHH responsable) {
        this.rec_humanos = responsable;
    }

    public void añadir_Gerente(Gerente responsable) {
        this.gerente = responsable;
    }
}
