/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej2;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Curandero implements Runnable {

    private Jugador target;

    public Curandero(Jugador jugador) {
        target = jugador;
    }

    public void run() {

        int vida = target.getVida();
        target.setVida(vida + 3);

//        for (int i = 1; i <= 1000; i++) {
//            target.curar(3);
//        }
    }

}
