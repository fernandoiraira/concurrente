/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej1;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Fumador implements Runnable {

    private int id;
    private SalaFumadores sala;

    //ID 1: TABACO Y FOSFOROS, PAPEL INFINITO
    //ID 2: TABACO Y PAPEL, FOSFOROS INFINITOS
    //ID 3: PAPEL Y FOSFOROS, TABACO INFINITO
    public Fumador(int id, SalaFumadores sala) {
        this.id = id;
        this.sala = sala;
    }

    public void run() {
        while (true) {
            try {
                sala.entraFumar(id);
                System.out.println("Fumador " + id + " esta fumando...");
                Thread.sleep(1000);
                sala.terminaFumar();
            } catch (Exception e) {
            }

        }

    }

}
