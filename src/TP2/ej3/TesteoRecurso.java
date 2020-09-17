/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej3;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class TesteoRecurso {

    public static void main(String[] args) {
        Cliente juan = new Cliente();
        Cliente ines = new Cliente();

        juan.setName("Juan Lopez");
        ines.setName("Ines Garcia");

        Thread t1 = new Thread(juan);
        Thread t2 = new Thread(ines);

        t1.setName("Juan Lopez");
        t2.setName("Ines Garcia");

        t1.start();
        t2.start();
    }

}
