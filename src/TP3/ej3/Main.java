/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej3;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Coordinador coord = new Coordinador();

        for (int i = 0; i < 2; i++) {
            Letra l1 = new Letra("A", coord);
            Thread a = new Thread(l1);
            a.start();
        }

        for (int i = 0; i < 2; i++) {
            Letra l1 = new Letra("BB", coord);
            Thread a = new Thread(l1);
            a.start();
        }

        for (int i = 0; i < 2; i++) {
            Letra l1 = new Letra("CCC", coord);
            Thread a = new Thread(l1);
            a.start();
        }

    }

}
