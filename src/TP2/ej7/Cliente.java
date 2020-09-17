/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej7;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;

    public Cliente(String nombre, int[] carrito) {
        this.nombre = nombre;
        this.carroCompra = carrito;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int[] getCarroCompra() {
        return this.carroCompra;
    }
}
