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
public class Cliente implements Runnable {

    Sillon sillon;

    public Cliente(Sillon sillon) {
        this.sillon = sillon;

    }

    public void run() {
        sillon.sentarse();
    }

}
