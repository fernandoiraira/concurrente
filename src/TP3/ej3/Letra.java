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
public class Letra implements Runnable {

    private String letra;
    private Coordinador coordinador;

    public Letra(String letra, Coordinador coordinador) {
        this.letra = letra;
        this.coordinador = coordinador;
    }

    public void run() {
        coordinador.esTurno(this);
    }
    
    public String getLetra(){
        return this.letra;
    }

}
