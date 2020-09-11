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
public class Vehiculo {

    private Surtidor surtidor;
    private String patente;
    private int modelo;
    private String marca;
    private int capacidadLitros = 50;
    private int litrosRestantes = 50;

    public Vehiculo(String patente, int modelo, String marca, Surtidor surtidor) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.surtidor = surtidor;
    }

    public void llenar() {
        this.litrosRestantes = this.capacidadLitros;
    }

    public void recorrerKm(int kms) {
        this.litrosRestantes = this.litrosRestantes - kms;

        if (this.litrosRestantes < 3) {
            surtidor.cargar(this);
        } else {
            System.out.println("No necesita nafta");
        }
    }

    public String getMatricula() {
        return this.patente;
    }
}
