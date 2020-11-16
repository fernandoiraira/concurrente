/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLocksCondicionales;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Buffer {

    private int cantidad;
    private int tamanio;
    private final Lock mutex = new ReentrantLock();

    private final Condition productores;

    private final Condition consumidores;

    public Buffer(int tam) {
        this.cantidad = 0;
        this.tamanio = tam;
        this.consumidores = mutex.newCondition();
        this.productores = mutex.newCondition();
    }

    public void producir() throws InterruptedException {
        mutex.lock();

        while (cantidad == tamanio) {
            System.out.println(Thread.currentThread().getName() + " esperando...");
            this.productores.await();
        }

        this.cantidad++;
        System.out.println("Puse un elemento");
        this.consumidores.signalAll();
        mutex.unlock();
    }

    public void consumir() throws InterruptedException {
        mutex.lock();

        while (cantidad == 0) {
            System.out.println(Thread.currentThread().getName() + " esperando, no hay nada...");
            this.consumidores.await();
        }

        this.cantidad--;
        this.productores.signalAll();
        mutex.unlock();
    }

}
