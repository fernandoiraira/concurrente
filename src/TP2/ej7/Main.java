/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej7;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Miguel", new int[]{2, 2, 1, 5, 2, 3});
        Cliente c2 = new Cliente("Rosa", new int[]{1, 3, 5, 1, 1});

        long initialTime = System.currentTimeMillis();
        Cajera cajera1 = new Cajera("cajera 1", c1, initialTime);
        Cajera cajera2 = new Cajera("cajera2", c2, initialTime);

        Thread t1 = new Thread(cajera1);
        Thread t2 = new Thread(cajera2);

        t1.start();
        t2.start();
    }

}
