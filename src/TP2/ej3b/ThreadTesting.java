/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej3b;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class ThreadTesting {

    public static void main(String[] args) {
        MiEjecucion h1 = new MiEjecucion();

        Thread t1 = new Thread(h1);

        t1.start();

        try {
            t1.join();

        } catch (Exception e) {

        }

        System.out.println("En el main");

    }

}
