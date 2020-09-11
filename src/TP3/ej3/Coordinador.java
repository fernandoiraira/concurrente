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

    public boolean esTurno(String caracter) {
        return this.lista[turno].equals(caracter);
    }

    public void siguiente() {
        this.turno = (turno + 1) % 3;
    }

}
