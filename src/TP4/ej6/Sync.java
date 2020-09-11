/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.ej6;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sync {

    int sumaTotal=0;
    int contador = 0;
    int tope;

    public Sync(int tope) {
        this.tope = tope;
    }

    public boolean termino() {
        return this.contador == tope;
    }

}
