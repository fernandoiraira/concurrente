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
public class Surtidor {

    private int litrosRestantes;

    public Surtidor(int litros) {
        this.litrosRestantes = litros;
    }

    public synchronized void cargar(Vehiculo auto) {
        //Se cargarán al auto la cantidad de litros que falten para llenar el tanque
        int aCargar = auto.getCapMax() - auto.getLitros();

        //Se verifica que la cantidad de litros disponibles en el surtidor alcancen para el auto
        if (aCargar <= this.litrosRestantes) {
            System.out.println("Se esta cargando el auto: " + Thread.currentThread().getName());

            //Al surtidor se le resta la cantidad de litros que se "lleva" el auto
            this.litrosRestantes -= aCargar;

            //Se llena el tanque
            auto.llenar();

            //Simula el tiempo de carga...
            try {
                Thread.sleep(700);
            } catch (Exception e) {

            }
            System.out.println("Se cargo el auto: " + Thread.currentThread().getName());
        } //En caso de que los litros no alcancen...
        else {
            System.out.println("El surtidor no dispone de esa cantidad de litros.");
        }
    }

}
