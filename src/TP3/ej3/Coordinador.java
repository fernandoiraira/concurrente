/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej3;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Coordinador {

    private String[] lista = {"A", "BB", "CCC"};
    private int turno = 0;

    public synchronized boolean esTurno(String cadena) {
        return this.lista[turno].equals(cadena);
    }

    public void next() {
        this.turno = (turno + 1) % 3;
    }

}
