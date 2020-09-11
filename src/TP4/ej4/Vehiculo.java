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

    private String patente;
    private int modelo;
    private String marca;
    private int kmFaltantesParaElService;

    public Vehiculo(String patente, int modelo, String marca, int kmFaltantesParaElService) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.kmFaltantesParaElService = kmFaltantesParaElService;
    }
}
