/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej4;

import java.util.Random;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        int cantSoldados = 12;
        int cantBandejas = 4;
        int cantAbridores = 1;
        int cantPostres = 1;
        //public Cuartel(int capMax, int cantBandejas, int cantAbridores, int cantPostres) {
        Cuartel cuartel = new Cuartel(cantBandejas, cantAbridores, cantPostres);

        for (int i = 1; i <= cantSoldados; i++) {
            int quierePostre = randomHasta(1);
            int quiereGaseosa = randomHasta(1);

            Soldado s = new Soldado(cuartel, quierePostre, quiereGaseosa);
            Thread soldado = new Thread(s, "Soldado " + i);
            soldado.start();
        }
    }

    public static int randomHasta(int maximo) {
        Random rand = new Random();

        return rand.nextInt(maximo + 1);
    }

}
