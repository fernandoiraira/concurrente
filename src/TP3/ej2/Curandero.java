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
public class Curandero implements Runnable {

    private Jugador target;

    public Curandero(Jugador jugador) {
        target = jugador;
    }

    public void run() {
        target.setVida(target.getVida() + 3);
//            target.recibeCuracion(3);
    }

}
