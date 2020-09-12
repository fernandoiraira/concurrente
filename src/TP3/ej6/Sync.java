/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej6;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sync {

    int sumaTotal = 0;
    int contador = 0;
    int tope;
    int cantHilos;

    public Sync(int tope, int cantHilos) {
        this.tope = tope;
        this.cantHilos = cantHilos;
    }

    public boolean termino() {
        return this.contador == cantHilos;
    }

    public synchronized void sumar(int suma) {
        this.sumaTotal = this.sumaTotal + suma;
        this.contador++;
    }

    public int getSuma() {
        return this.sumaTotal;
    }

}
