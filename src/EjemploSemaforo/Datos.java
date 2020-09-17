/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSemaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Datos {

    private int dato;
    private Semaphore mutex;

    public Datos(int nro) {
        dato = nro;
        mutex = new Semaphore(1);
    }

    public int getDato() {
        return dato;
    }

    public void incrementar() {

        try {
            mutex.acquire();
        } catch (Exception e) {

        }

        dato++;
        mutex.release();
    }

}
