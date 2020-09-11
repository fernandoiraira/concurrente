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
public class Jugador {

    int vida = 10;

    public synchronized void dañar(int cant) {
        vida = vida - cant;
    }

    public synchronized void curar(int cant) {
        vida = vida + cant;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
