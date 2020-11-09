/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class SalaFumadores {

    private Object tabacoFosforos = new Object(); //id 1
    private Object tabacoPapel = new Object(); //id 2
    private Object papelFosforos = new Object(); //id 3
    private Semaphore colocarIngrediente = new Semaphore(1);

    private boolean puedeID1 = false;
    private boolean puedeID2 = false;
    private boolean puedeID3 = false;

    public synchronized void entraFumar(int id) {
        switch (id) {
            case 1:
                while (!puedeID1) {
                    try {
                        System.out.println("Falta tabaco y fosforos, no puedo fumar");
                        this.tabacoFosforos.wait();
                    } catch (Exception e) {
                    }
                }
                System.out.println("El fumador toma el tabaco y los fosforos...");
                this.puedeID1 = false;
                break;
            case 2:
                while (!puedeID2) {
                    try {
                        System.out.println("Falta tabaco y papel, no puedo fumar");
                        this.tabacoPapel.wait();
                    } catch (Exception e) {
                    }
                }
                System.out.println("El fumador toma el tabaco y el papel...");
                this.puedeID2 = false;
                break;
            case 3:
                while (!puedeID3) {
                    try {
                        System.out.println("Falta papel y fosforos, no puedo fumar");
                        this.papelFosforos.wait();
                    } catch (Exception e) {
                    }
                }
                System.out.println("El fumador toma el papel y los fosforos...");
                this.puedeID3 = false;
                break;
            default:
                throw new AssertionError();
        }

    }

    public synchronized void terminaFumar() {
        this.colocarIngrediente.release();
    }

    public synchronized void colocar(int opcion) {

        try {
            this.colocarIngrediente.acquire();
        } catch (Exception ex) {

        }

        switch (opcion) {
            case 1:
                System.out.println("El agente esta colocando tabaco y fosforos...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                this.puedeID1 = true;
                this.tabacoFosforos.notify();
                break;
            case 2:
                System.out.println("El agente esta colocando tabaco y papel...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                this.puedeID2 = true;
                this.tabacoPapel.notify();
                break;
            case 3:
                System.out.println("El agente esta colocando papel y fosforos...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                this.puedeID3 = true;
                this.papelFosforos.notify();
                break;
            default:
                throw new AssertionError();
        }

    }

}
