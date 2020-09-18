/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej4;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Auto extends Vehiculo implements Runnable {

    public Auto(String patente, int modelo, String marca, Surtidor surtidor) {
        super(patente, modelo, marca, surtidor);
    }

    public void run() {
        //Simula el recorrido de los autos en bucle en bucle
        while (true) {
            //Se recorre una cantidad de kms aleatoria
            this.recorrerKm((int) (Math.random() * 20));
        }
    }
}
