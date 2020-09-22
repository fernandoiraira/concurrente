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
public class Barbero implements Runnable {
    private int atendidos = 0;
    private Sillon sillon;
    private int aAtender;

    public Barbero(Sillon sillon, int cant) {
        this.sillon = sillon;
        this.aAtender = cant;
    }

    public void run() {
        
        while(this.atendidos <= this.aAtender ){
            sillon.atender();
            this.atendidos++;
        }

    }

}
