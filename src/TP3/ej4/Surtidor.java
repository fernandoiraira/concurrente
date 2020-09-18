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
        int aCargar = auto.getCapMax() - auto.getLitros();

        if (aCargar <= this.litrosRestantes) {
            System.out.println("Se esta cargando el auto: " + auto.getMatricula());
            this.litrosRestantes -= aCargar;
            auto.llenar();
            try {
                Thread.sleep(700);
            } catch (Exception e) {

            }
            System.out.println("Se cargo el auto: " + auto.getMatricula());
        } else {
            System.out.println("El surtidor esta agotado.");
        }
    }

}
