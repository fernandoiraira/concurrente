/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej6;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cajera {

    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg.");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this​.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + "->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg.");
        }

        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg.");
    }

    public void esperarXsegundos(int delay) {

        try {
            Thread.sleep(delay * 1000);

        } catch (Exception e) {

        }

    }
}
