/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_07_09_2020;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
class Dato {

    private int valor;

    public synchronized void contar() {
        valor = ++valor;
    }

    int obtenerValor() {
        return valor;
    }

}
