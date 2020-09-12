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
public class HiloSumador implements Runnable {

    Sync sync;
    int[] array;
    int inicio;
    int fin;
    int suma = 0;

    public HiloSumador(int[] array, int inicio, int fin, Sync sync) {
        this.array = array;
        this.inicio = inicio;
        this.fin = fin;
        this.sync = sync;
    }

    public void run() {
        for (int i = inicio; i <= fin; i++) {
            suma = suma + array[i];
        }

        sync.sumar(suma);
    }

}
