/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_Observatorio_Monitores;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Investigador implements Runnable {

    private Observatorio observatorio;

    public Investigador(Observatorio obs) {
        this.observatorio = obs;
    }

    public void run() {
        while (true) {
            this.observatorio.entrarInvestigador();
            this.investigar();
            this.observatorio.salirInvestigador();
        }

    }

    public void investigar() {
        try {
            System.out.println(Thread.currentThread().getName() + " esta investigando...");
            Thread.sleep(4000);
        } catch (Exception e) {
        }

    }

}
