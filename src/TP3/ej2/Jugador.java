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

    public void dañar(int cant) {
        vida = vida - cant;
    }

    public void curar(int cant) {
        vida = vida + cant;
    }

}
