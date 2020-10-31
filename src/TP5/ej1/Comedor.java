/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5.ej1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Comedor {

    private Semaphore semPerros;
    private Semaphore semGatos;
    private Semaphore mutex;
    private int comidos = 0;
    private int cantGatos;
    private int cantPerros;
    private int capacidad;
    private int cantPerrosRestantes;
    private int cantGatosRestantes;
    private int turno = 0; //Si es 0, comen los perros, si es 1, comen los gatos

    public Comedor(int capacidad, int cantPerros, int cantGatos) {

        this.cantGatos = cantGatos;
        this.cantPerros = cantPerros;
        this.capacidad = capacidad;
        this.cantGatosRestantes = this.cantGatos;
        this.cantPerrosRestantes = this.cantPerros;

        if (cantGatos < capacidad) {
            this.semGatos = new Semaphore(cantGatos);
        } else {
            this.semGatos = new Semaphore(capacidad);
        }

        this.semPerros = new Semaphore(0);
        this.mutex = new Semaphore(1);
    }

    public void entrar(int id) {
        if (id == 0) {
            try {
                this.semPerros.acquire();
            } catch (Exception e) {
            }
        } else {
            try {
                this.semGatos.acquire();
            } catch (Exception e) {
            }
        }
    }

    public void comer() {
        System.out.println(Thread.currentThread().getName() + " esta comiendo...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + " termino de comer y se fue.");

        try {
            this.mutex.acquire();

            this.comidos++;

            if (this.turno == 0) {
                this.cantGatosRestantes--;

                if (this.cantPerrosRestantes == 0) {
                    this.semGatos.release(capacidad);
                } else if (this.cantGatosRestantes == 0 || this.comidos == this.capacidad) {
                    this.turno = 1;
                    this.comidos = 0;
                    if (cantPerros < capacidad) {
                        this.semPerros.release(cantPerros);
                    } else {
                        this.semPerros.release(capacidad);
                    }
                }
            } else {
                this.cantPerrosRestantes--;

                if (this.cantGatosRestantes == 0) {
                    this.semPerros.release(capacidad);

                } else if (this.cantPerrosRestantes == 0 || this.comidos == this.capacidad) {
                    this.turno = 0;
                    this.comidos = 0;

                    if (this.cantGatos < this.capacidad) {
                        this.semGatos.release(this.cantGatos);
                    } else {
                        this.semGatos.release(capacidad);
                    }
                }
            }

        } catch (Exception e) {
        }

        this.mutex.release();
    }

}
