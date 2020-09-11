/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.ej4;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Surtidor {

    public synchronized void cargar(Vehiculo auto) {
        System.out.println("Se esta cargando el auto: " + auto.getMatricula());
        auto.llenar();
        try {
            Thread.sleep(700);
        } catch (Exception e) {

        }
        System.out.println("Se cargo el auto: " + auto.getMatricula());
    }

}
