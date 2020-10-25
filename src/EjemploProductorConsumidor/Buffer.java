/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploProductorConsumidor;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Buffer {

    private final Semaphore semConsumidor;
    private final Semaphore semProductor;
    private final Semaphore mutex;
    private final int cantMaxima;
    private int cantActual = 0;

    public Buffer(String nomb, int cantStock) {
        cantMaxima = cantStock;
        semConsumidor = new Semaphore(0);
        semProductor = new Semaphore(this.cantMaxima);
        mutex = new Semaphore(1);
    }

    public void agregarProducto() {
        try {
            this.semProductor.acquire();
            System.out.println("El productor esta agregando un producto...");
            Thread.sleep(1000);
            System.out.println("El productor agrego un producto.");
            this.cantActual++;

            if (this.cantActual == this.cantMaxima) {
                this.semConsumidor.release(this.cantMaxima);
            }
        } catch (Exception e) {
        }
    }

    public void consumirProducto() {
        try {
            this.semConsumidor.acquire();
            System.out.println(Thread.currentThread().getName() + " esta consumiendo un producto...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " termino de consumir.");

            mutex.acquire();
            this.cantActual--;

            if (this.cantActual == 0) {
                this.semProductor.release(this.cantMaxima);
            }

            mutex.release();

        } catch (Exception e) {
        }

    }
}
