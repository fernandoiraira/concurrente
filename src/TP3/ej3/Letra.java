/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej3;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Letra implements Runnable {

    private String cadena;
    private Coordinador coordinador;

    public Letra(String cadena, Coordinador coordinador) {
        this.cadena = cadena;
        this.coordinador = coordinador;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            while (!coordinador.esTurno(cadena)) {
            
            }
            System.out.println(cadena);
            coordinador.next();

        }
    }

    public String getLetra() {
        return this.cadena;
    }

}
