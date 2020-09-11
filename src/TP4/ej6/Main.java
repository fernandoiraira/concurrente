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
public class Main {

    public static void main(String[] args) {

        int k = 3; //Numero de Hilos
        int tope = 7;
        int c = 0;
        HiloSumador[] hilo = new HiloSumador[k];
        int[] array = new int[tope];
        Sync sync = new Sync(1);

        for (int i = 0; i <= tope - 1; i++) {
            array[i] = 2;
        }

        while ((tope - (c - 1) > k)) {
            hilo[c] = new HiloSumador(array, c, c + ((tope / k) - 1), sync); //int[] array, int inicio, int fin, Sync sync
            c = c + ((tope / k) - 1);
        }

        while (!sync.termino()) {

        }

        System.out.println("Suma total: " + sync.getSuma());

    }
}
