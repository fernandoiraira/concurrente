/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej3;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Cliente implements Runnable {

    private String nombre;

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getName() {
        return this.nombre;
    }

    @Override
    public void run() {
        System.out.println("soy  " + this.nombre);
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }

}
