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
public class Main {

    public static void main(String[] args) {
        Jugador player = new Jugador();
        Orco orco = new Orco(player);
        Curandero curandero = new Curandero(player);

        Thread o1 = new Thread(orco);
        Thread c1 = new Thread(curandero);

        o1.start();
        c1.start();
 
        try { //Espero a que termine la ejecucion de los hilos, porque sino cuando muestro la vida por pantalla, me la muestra con error
            o1.join();
            c1.join();
        } catch (Exception e) {

        }

        System.out.println("Vida de Jugador: " + player.getVida());

    }

}
