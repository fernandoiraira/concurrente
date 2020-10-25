/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploProductorConsumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Productor implements Runnable {

    private String nombre;
    private Buffer buf;

    public Productor(String nom, Buffer buffer) {
        nombre = nom;
        buf = buffer;
    }

    public void run() {
        while (true) {
            buf.agregarProducto();
        }
    }
}
