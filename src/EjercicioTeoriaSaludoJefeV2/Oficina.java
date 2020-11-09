/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTeoriaSaludoJefeV2;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Oficina {

    private int cantActualEmpleados;
    private int cantTotalEmpleados;

    private boolean jefeSaludo = false;

    public Oficina(int cantTotal) {
        this.cantActualEmpleados = 0;
        this.cantTotalEmpleados = cantTotal;
    }

    public synchronized void saludoJefe() {
        while (this.cantActualEmpleados != this.cantTotalEmpleados) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        System.out.println("JEFE> Buenos dias!");
        this.jefeSaludo = true;
        this.notifyAll();
    }

    public synchronized void entrar() {
        System.out.println(Thread.currentThread().getName() + " entro a la oficina.");
        this.cantActualEmpleados++;

        if (this.cantActualEmpleados == this.cantTotalEmpleados) {
            this.notifyAll();
        }
    }

    public synchronized void saludoEmpleado() {
        while (this.cantActualEmpleados != this.cantTotalEmpleados || !this.jefeSaludo) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        System.out.println(Thread.currentThread().getName() + "> Buenos dias jefe!");
    }
}
