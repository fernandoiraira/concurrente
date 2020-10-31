/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5.ej1;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        int cantGatos = 100;
        int cantPerros = 2;
        int capacidadComedor = 40;

        Comedor comedor = new Comedor(capacidadComedor, cantPerros, cantGatos);

        for (int i = 1; i <= cantGatos; i++) {
            Gato g = new Gato(comedor);
            Thread gato = new Thread(g, "Gato " + i);
            gato.start();
        }

        for (int i = 1; i <= cantPerros; i++) {
            Perro p = new Perro(comedor);
            Thread perro = new Thread(p, "Perro " + i);
            perro.start();
        }

    }

}
