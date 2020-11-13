/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej4;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Cuartel {

    private int capActual = 0;

    private Semaphore semAlmuerzo;
    private Semaphore semAbridores;
    private Semaphore semPostre;

    public Cuartel(int cantBandejas, int cantAbridores, int cantPostres) {
        this.semAlmuerzo = new Semaphore(cantBandejas, true);
        this.semAbridores = new Semaphore(cantAbridores, true);
        this.semPostre = new Semaphore(cantPostres, true);
    }

    public void entrar() {

        try {
            this.semAlmuerzo.acquire();

            System.out.println(Thread.currentThread().getName() + " entro al cuartel...");

        } catch (Exception e) {
        }
    }

    public void tomarBandeja(boolean quierePostre, boolean quiereGaseosa) {

        this.semAlmuerzo.release(); //Devolverlo aca o abajo??????
        if (quiereGaseosa) {
            try {
                System.out.println(Thread.currentThread().getName() + " trata de agarrar un abridor...");
                this.semAbridores.acquire();
                System.out.println(Thread.currentThread().getName() + " pudo agarrar un abridor, esta abriendo su gaseosa...");
                realizarTarea();
                System.out.println(Thread.currentThread().getName() + " abrio la gaseosa.");
                this.semAbridores.release();
            } catch (Exception ex) {
            }
        }

        if (quierePostre) {
            try {
                System.out.println(Thread.currentThread().getName() + " trata de agarrar un postre...");
                this.semPostre.acquire();
                System.out.println(Thread.currentThread().getName() + " toma un poste del mostrador...");
                realizarTarea();
                System.out.println(Thread.currentThread().getName() + " tomo un postre.");
                this.semPostre.release();
            } catch (Exception e) {
            }
        }
    }

    public void comer() {
        System.out.println(Thread.currentThread().getName() + " esta comiendo...");
        this.realizarTarea();
    }

    public void salir() {
        try {
            System.out.println(Thread.currentThread().getName() + " termino de comer y se fue.");
            //this.semAlmuerzo.release();
        } catch (Exception ex) {

        }
    }

    // METODOS IMPORTANTES PARA OTROS PARCIALES
    private void realizarTarea() {
        try {
            Thread.sleep(this.randomHasta(4));
        } catch (Exception e) {
        }
    }

    private int randomHasta(int maximo) {
        Random rand = new Random();

        return ((rand.nextInt(maximo)) + 1) * 1000;
    }

}
