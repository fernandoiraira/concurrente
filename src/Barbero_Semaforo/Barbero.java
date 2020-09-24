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

    private Sillon sillon;
    boolean seguir = true;

    public Barbero(Sillon sillon) {
        this.sillon = sillon;
    }

    public void run() {

        while (seguir) {
            sillon.atender();
        }
    }
    
    public void terminar(){
        this.seguir = false;
    }

}
