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
public class Gato implements Runnable {

    private Comedor comedor;
    private int id = 1;

    public Gato(Comedor comedor) {
        this.comedor = comedor;
    }

    public void run() {
        comedor.entrar(id);
        comedor.comer();
    }

}
