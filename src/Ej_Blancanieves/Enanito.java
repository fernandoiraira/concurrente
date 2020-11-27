/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_Blancanieves;

/*
 * Mauricio Sawicki
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mausa
 */
public class Enanito implements Runnable {

    private Mesa mesa;

    public Enanito(Mesa unaMesa) {
        this.mesa = unaMesa;
    }

    public void run() {
        try {

            this.trabajar();
            if (mesa.entrarAComer()) {
                this.comer();
                mesa.terminarDeComer();
            }
            this.trabajar();
            if (mesa.entrarAComer()) {
                this.comer();
                mesa.terminarDeComer();
            }

            this.dormir();
        } catch (InterruptedException ex) {
            Logger.getLogger(Enanito.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void comer() {
        try {
            System.out.println(Thread.currentThread().getName() + " está comiendo..");
            Thread.sleep(2000);

        } catch (InterruptedException ex) {
            Logger.getLogger(Enanito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void trabajar() {
        try {
            System.out.println(Thread.currentThread().getName() + " se fue a trabajar..");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Enanito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dormir() {
        try {
            System.out.println(Thread.currentThread().getName() + " se fue a dormir..");
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Enanito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
