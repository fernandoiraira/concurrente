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
        
        int k = 2; //Numero de Hilos
        int[] array = new int[50000];
        Sync sync = new Sync(1);

        for (int i = 0; i <= 49999; i++) {
            array[i] = 2;
        }
        

        HiloSumador h1 = new HiloSumador(array, 0, 49999, sync);

        Thread t1 = new Thread(h1);

        t1.start();

        while (!sync.termino()) {

        }

        System.out.println("Suma total: " + sync.getSuma());

    }
}
