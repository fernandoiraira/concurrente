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
public class Mantenimiento implements Runnable {

    private Observatorio observatorio;

    public Mantenimiento(Observatorio obs) {
        this.observatorio = obs;
    }

    public void run() {
        while (true) {
            this.observatorio.entrarMantenimiento();
            this.mantener();
            this.observatorio.salirMantenimiento();
        }

    }

    public void mantener() {
        try {
            System.out.println(Thread.currentThread().getName() + " esta realizando mantenimiento...");
            Thread.sleep(2000);
        } catch (Exception e) {
        }

    }

}
