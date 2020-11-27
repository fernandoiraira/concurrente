/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_Observatorio_Monitores;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Visitante implements Runnable {

    private Observatorio observatorio;
    private boolean tieneSilla;

    public Visitante(Observatorio obs, int tieneS) {
        this.observatorio = obs;
        this.tieneSilla = (tieneS == 1);
    }

    public void run() {
        this.observatorio.entrar(this.tieneSilla);
        this.recorrer();
        this.observatorio.salir(this.tieneSilla);
    }

    public void recorrer() {
        System.out.println(Thread.currentThread().getName() + " esta estudiando las estrellas...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

}
