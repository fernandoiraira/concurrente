/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej1;

import java.util.Random;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Agente implements Runnable {

    private SalaFumadores sala;
    private Random r;

    public Agente(SalaFumadores sala) {
        this.sala = sala;
        r = new Random();
    }

    public void run() {
        while (true) {
            sala.colocar(r.nextInt(3) + 1); //Random de 0 a 3
        }//while
    }// run
}//clase

