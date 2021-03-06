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
        int cantClientes = 5;
        Sillon sillon = new Sillon(cantClientes);
        Barbero barbero = new Barbero(sillon);
        sillon.setBarbero(barbero);
        Thread b = new Thread(barbero);
        b.start();

        for (int i = 0; i < cantClientes; i++) {
            Cliente c1 = new Cliente(sillon);
            Thread t = new Thread(c1, "Cliente " + i);
            t.start();
        }
    }

}
