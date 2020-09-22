/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barbero_Semaforo;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Sillon sillon = new Sillon();

        for (int i = 0; i < 10; i++) {
            Cliente c1 = new Cliente(sillon);
            Thread t = new Thread(c1, "Cliente " + i);
            t.start();
        }

    }

}
