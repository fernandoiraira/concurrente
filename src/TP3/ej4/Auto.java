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
        boolean seguir = true;
        //Simula el recorrido de los autos en bucle en bucle
        while (seguir) {
            //Se recorre una cantidad de kms aleatoria, antes se verifica que el auto tenga nafta
            if (this.litrosRestantes > 0) {
                this.recorrerKm((int) (Math.random() * 20));
            } else {
                //En caso de que no se tenga nafta y ya no se haya podido cargar se mostrará este cartel y se terminará el bucle.
                System.out.println(Thread.currentThread().getName() + " se detuvo, no tiene nafta en su tanque y no hay disponible en el surtidor.");
                seguir = false;
            }
        }
    }
}
