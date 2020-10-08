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
        enterprise.solicitar_añdir_adm(contador1);
        enterprise.solicitar_añdir_adm(asistente1);

        //Se añaden vendedores a la empresa
        enterprise.solicitar_añdir_vendedor(new Vendedor("7005044-7", "Roberto", 50.000, "Metropolitana", 12));
        enterprise.solicitar_añdir_vendedor(new Vendedor("8512646-6", "Jean", 50.000, "Metropolitana", 13));
        enterprise.solicitar_añdir_vendedor(new Vendedor("5302870-5", "Pedro", 50.000, "Norte", 9));
        enterprise.solicitar_añdir_vendedor(new Vendedor("16319006-0", "Diego", 50.000, "Sur", 10));

        //Se añaden obreros a la empresa
        enterprise.solicitar_añdir_obrero(new Obrero("19785911-3", "Juan", 20.000, 1.1, 4, "Primer turno"));
        enterprise.solicitar_añdir_obrero(new Obrero("18040131-8", "Carlos", 20.000, 1.3, 6, "Primer turno"));
        enterprise.solicitar_añdir_obrero(new Obrero("6129670-0", "Mario", 20.000, 1.4, 7, "Segundo turno"));
        enterprise.solicitar_añdir_obrero(new Obrero("14463144-7", "Ruben", 20.000, 1.6, 5, "Segundo turno"));
        enterprise.solicitar_añdir_obrero(new Obrero("14578502-2", "Fabricio", 20.000, 1.2, 3, "Tercer turno"));
        enterprise.solicitar_añdir_obrero(new Obrero("21376139-0", "Ignacio", 20.000, 1.5, 5, "Tercer turno"));

        enterprise.imprimir_sueldos();

    }

    public void añadir_RRHH(ResponsableRRHH responsable) {
        this.rec_humanos = responsable;
    }

    public void añadir_Gerente(Gerente responsable) {
        this.gerente = responsable;
    }

    public void solicitar_añdir_adm(Empleado responsable) {
        rec_humanos.agregar_administrativos(this, responsable);
    }

    public void solicitar_añdir_obrero(Empleado responsable) {
        rec_humanos.agregar_obrero(this, responsable);
    }

    public void solicitar_añdir_vendedor(Empleado responsable) {
        rec_humanos.agregar_vendedor(this, responsable);
    }

    public void imprimir_sueldos() {
        for (Administrativo i : this.administrativos) {
            System.out.println(i);
        }

        for (Obrero i : this.obreros) {
            System.out.println(i);
        }

        for (Vendedor i : this.vendedores) {
            System.out.println(i);
        }
    }

}
