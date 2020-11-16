/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej5;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Puente {
    
    private int limite;
    private int turnoEntrada = 1;
    private int turnoSalida = 1;
    private boolean esTurnoDelNorte = true;

    private int restantesNorteSur;
    private int restantesSurNorte;

    public Puente(int limite, int restantesNorteSur, int restantesSurNorte) {
        this.limite = limite + 1;
        this.restantesNorteSur = restantesNorteSur;
        this.restantesSurNorte = restantesSurNorte;
    }

    public synchronized void entrarCocheDelNorte(Auto vehiculo) {

        while (!esTurnoDelNorte || this.turnoEntrada >= this.limite) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        System.out.println(Thread.currentThread().getName() + " esta cruzando el puente (turno " + this.turnoEntrada + ")...");
        vehiculo.setTurno(turnoEntrada);
        turnoEntrada++;
    }

    public synchronized void salirCocheDelNorte(Auto vehiculo) {

        while (this.turnoSalida != vehiculo.getTurno()) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        this.turnoSalida++;

        System.out.println(Thread.currentThread().getName() + " salio del puente (turno " + vehiculo.getTurno() + ").");
        this.restantesNorteSur--;

        if (vehiculo.getTurno() == this.limite - 1 || this.restantesNorteSur == 0) {
            this.turnoEntrada = 1;
            this.turnoSalida = 1;
            this.esTurnoDelNorte = false;
            System.out.println("--------------------------------------------------------------------------------------------------------------");
        }

        this.notifyAll();
    }

    public synchronized void entrarCocheDelSur(Auto vehiculo) {

        while (esTurnoDelNorte || this.turnoEntrada >= this.limite) {
            try {
                this.wait();

            } catch (Exception e) {
            }
        }

        System.out.println(Thread.currentThread().getName() + " esta cruzando el puente (turno " + this.turnoEntrada + ")...");
        vehiculo.setTurno(turnoEntrada);
        turnoEntrada++;
    }

    public synchronized void salirCocheDelSur(Auto vehiculo) {
//        if (this.restantesNorteSur == 0) {
//            //PASAMOS LIBREMENTE...            
//        }

        while (this.turnoSalida != vehiculo.getTurno()) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }
        this.restantesSurNorte--;
        this.turnoSalida++;

        System.out.println(Thread.currentThread().getName() + " salio del puente (turno " + vehiculo.getTurno() + ").");

        if (vehiculo.getTurno() == this.limite - 1 || this.restantesSurNorte == 0) {
            this.turnoEntrada = 1;
            this.turnoSalida = 1;
            this.esTurnoDelNorte = true;
            System.out.println("--------------------------------------------------------------------------------------------------------------");
        }

        this.notifyAll();
    }

}
