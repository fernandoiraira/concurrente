/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej2;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Jugador {

    int vida = 10;

//    public synchronized void dañar(int cant) {
//        vida = vida - cant;
//    }
//
//    public synchronized void curar(int cant) {
//        vida = vida + cant;
//    }

    public synchronized int getVida() {
        return this.vida;
    }

    public synchronized void setVida(int vida) {
        System.out.println(Thread.currentThread().getName() + " Modificando vida...");
        this.vida = vida;
        System.out.println("La nueva vida del jugador es: " + vida);
    }

}
