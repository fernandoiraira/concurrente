/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej5;

import java.util.Random;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Auto implements Runnable {

    private boolean haciaNorte;
    private Puente puente;
    private int turno = -1;

    public Auto(Puente puente, boolean haciaNorte) {
        this.puente = puente;
        this.haciaNorte = haciaNorte;
    }

    public void run() {
        if (haciaNorte) {
            puente.entrarCocheDelNorte(this);
            this.cruzarPuente();
            puente.salirCocheDelNorte(this);
        } else {
            puente.entrarCocheDelSur(this);
            this.cruzarPuente();
            puente.salirCocheDelSur(this);
        }
    }

    private void cruzarPuente() {
        try {
            Thread.sleep(this.randomHasta(4));
        } catch (Exception e) {
        }
    }

    private int randomHasta(int maximo) {
        Random rand = new Random();

        return ((rand.nextInt(maximo)) + 1) * 1000;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setTurno(int t) {
        this.turno = t;
    }

}
