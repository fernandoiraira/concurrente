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

    public synchronized  void esTurno(Letra objeto) {

        while (!this.lista[turno].equals(objeto.getLetra())) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        synchronized (this) {
            System.out.println(objeto.getLetra());
            this.turno = (this.turno + 1) % 3;
        }

    }

}
