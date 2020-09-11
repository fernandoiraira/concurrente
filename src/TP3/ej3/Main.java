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

        Letra l1 = new Letra("A", coord);
        Thread a = new Thread(l1);
        a.start();

        Letra l2 = new Letra("BB", coord);
        Thread b = new Thread(l2);
        b.start();

        Letra l3 = new Letra("CCC", coord);
        Thread c = new Thread(l3);
        c.start();

    }

}
