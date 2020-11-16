/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLocksCondicionales;

import EjemploProductorConsumidor.*;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Consumidor implements Runnable {

    private String nombre;
    private Buffer buf;

    public Consumidor(String nom, Buffer buffer) {
        nombre = nom;
        buf = buffer;
    }

    public void run() {
        while (true) {
            try {
                buf.consumir();
                System.out.println(Thread.currentThread().getName() + " esta consumiendo...");
            } catch (Exception e) {
            }

        }
    }
}
