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
public class Main {

    public static void main(String[] args) {

        int k = 3; //Numero de Hilos
        int tope = 50000;
        int alcance = tope/k;
        int c = 0;
        HiloSumador[] hilo = new HiloSumador[k];
        int[] array = new int[tope];
        Sync sync = new Sync(1);

        for (int i = 0; i <= tope - 1; i++) {
            array[i] = 2;
        }

        while (!sync.termino()) {

        }

        System.out.println("Suma total: " + sync.getSuma());

    }
}
