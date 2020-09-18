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
public class Vehiculo {

    private Surtidor surtidor;
    private String patente;
    private int modelo;
    private String marca;
    private int capacidadLitros = 50;
    protected int litrosRestantes = 50;

    public Vehiculo(String patente, int modelo, String marca, Surtidor surtidor) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.surtidor = surtidor;
    }

    public int getCapMax() {
        return this.capacidadLitros;
    }

    public int getLitros() {
        return this.litrosRestantes;
    }

    public void llenar() {
        this.litrosRestantes = this.capacidadLitros;
    }

    public void recorrerKm(int litros) {
        //Se simula el tiempo que dura el recorrido del auto
        try {
            System.out.println("El vehiculo " + Thread.currentThread().getName() + " se esta moviendo...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {

        }
        this.litrosRestantes = this.litrosRestantes - litros;

        if (this.litrosRestantes < 0) {
            System.out.println("El vehiculo " + Thread.currentThread().getName() + " necesita combustible.");
            surtidor.cargar(this);
        }
    }

    public String getMatricula() {
        return this.patente;
    }
}
