/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLocksCondicionales;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        int cantElementos = 5;

        Buffer buf = new Buffer(cantElementos);

        for (int i = 1; i <= 2; i++) {
            Productor p1 = new Productor("benecio", buf);
            Thread h1 = new Thread(p1, "Productor");
            h1.start();
        }

        for (int i = 1; i <= 10; i++) {
            Consumidor c1 = new Consumidor("juan", buf);
            Thread h2 = new Thread(c1, "Consumidor " + i);
            h2.start();
        }

    }

}
