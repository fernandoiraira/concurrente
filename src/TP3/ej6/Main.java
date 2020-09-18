/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej6;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        int k = 50; //Numero de Hilos
        int tope = 50000;
        int alcance = tope / k;
        int c = 0;
        Thread[] hilo = new Thread[k];
        int[] array = new int[tope];
        Sync sync = new Sync(tope, k);

        for (int i = 0; i <= tope - 1; i++) {
            array[i] = 1;
        }

        for (int i = 0; i <= k - 2; i++) {
            HiloSumador h = new HiloSumador(array, c, c + alcance, sync); //int[] array, int inicio, int fin, Sync sync
            System.out.println("Hilo " + i + ": desde: " + c + " hasta: " + (c + alcance));
            hilo[i] = new Thread(h);
            c = c + (alcance + 1);
        }

        HiloSumador h = new HiloSumador(array, c, tope - 1, sync); //int[] array, int inicio, int fin, Sync sync
        System.out.println("Hilo " + (k - 1) + ": desde: " + (c) + " hasta: " + (tope - 1));
        hilo[k - 1] = new Thread(h);

        System.out.println("Cantidad de hilos total: " + hilo.length);

        for (int i = 0; i < k; i++) {
            hilo[i].start();
        }

    }
}
