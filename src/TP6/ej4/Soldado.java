/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej4;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Soldado implements Runnable {

    private Cuartel cuartel;
    private boolean quierePostre;
    private boolean quiereGaseosa;

    public Soldado(Cuartel cuartel, int quierePostre, int quiereGaseosa) {
        this.cuartel = cuartel;
        this.quierePostre = (quierePostre == 1);
        this.quiereGaseosa = (quiereGaseosa == 1);
    }

    public void run() {
        cuartel.entrar();
        cuartel.tomarBandeja(this.quierePostre, this.quiereGaseosa);
        cuartel.comer();
        cuartel.salir();
    }

}
