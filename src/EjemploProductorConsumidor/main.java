/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploProductorConsumidor;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        Buffer buf = new Buffer("Buffesito", 10);
        Productor p1 = new Productor("benecio", buf);

        Thread h1 = new Thread(p1, "productor");

        for (int i = 1; i <= 10; i++) {
            Consumidor c1 = new Consumidor("juan", buf);
            Thread h2 = new Thread(c1, "consumidor");
            h2.start();
        }

        h1.start();

    }

}
