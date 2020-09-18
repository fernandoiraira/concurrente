/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej4;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Surtidor ypf = new Surtidor(1000);

        for (int i = 0; i < 6; i++) {
            Auto a = new Auto(Integer.toString(i), i, Integer.toString(i), ypf); //String patente, int modelo, String marca, Surtidor surtidor
            Thread aT = new Thread(a);

            aT.start();
        }
    }
}
