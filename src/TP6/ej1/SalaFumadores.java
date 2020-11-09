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

    public void entraFumar(int id) {
        switch (id) {
            case 1:
                try {
                    while (!puedeID1) {
                        System.out.println("Falta tabaco y fosforos, no puedo fumar");

                        synchronized (tabacoFosforos) {
                            this.tabacoFosforos.wait();
                        }

                    }
                } catch (Exception e) {
                }
                System.out.println("El fumador toma el tabaco y los fosforos...");
                this.puedeID1 = false;
                break;
            case 2:
                try {
                    while (!puedeID2) {
                        System.out.println("Falta tabaco y papel, no puedo fumar");

                        synchronized (tabacoPapel) {
                            this.tabacoPapel.wait();
                        }

                    }
                } catch (Exception e) {
                }
                System.out.println("El fumador toma el tabaco y el papel...");
                this.puedeID2 = false;
                break;
            case 3:
                try {
                    while (!puedeID3) {
                        System.out.println("Falta papel y fosforos, no puedo fumar");

                        synchronized (papelFosforos) {
                            this.papelFosforos.wait();
                        }

                    }
                } catch (Exception e) {
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

    public void colocar(int opcion) {

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
                synchronized (tabacoFosforos) {
                    this.tabacoFosforos.notify();
                }

                break;
            case 2:
                System.out.println("El agente esta colocando tabaco y papel...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                this.puedeID2 = true;
                synchronized (tabacoPapel) {
                    this.tabacoPapel.notify();
                }

                break;
            case 3:
                System.out.println("El agente esta colocando papel y fosforos...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                this.puedeID3 = true;

                synchronized (papelFosforos) {
                    this.papelFosforos.notify();
                }

                break;
            default:
                throw new AssertionError();
        }

    }

}
