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
public class HiloSumador implements Runnable {

    int[] array;
    int inicio;
    int fin;

    public HiloSumador(int[] array, int inicio, int fin) {
        this.array = array;
        this.inicio = inicio;
        this.fin = fin;
    }

    public void run() {

    }

}
