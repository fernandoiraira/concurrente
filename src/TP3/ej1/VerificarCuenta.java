/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VerificarCuenta implements Runnable {

    private CuentaBanco cb = new CuentaBanco();

    private void hacerRetiro(int cantidad) throws InterruptedException {
        if (cb.getBalance() >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " esta realizando un retiro de: " + cantidad + ".");
            Thread.sleep(1000);
            cb.retiroBancario(cantidad);
            System.out.println(Thread.currentThread().getName() + ":Retiro realizado");
            System.out.println(Thread.currentThread().getName() + ": Losfondos son de: " + cb.getBalance());
        } else {
            System.out.println("No hay suficiente dinero en la cuentapara realizar el retiro Sr." + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de" + cb.getBalance());
            Thread.sleep(1000);
        }
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {

            try {
                this.hacerRetiro(10);
                if (cb.getBalance() < 0) {
                    System.out.println("La cuenta esta sobregirada.");
                }
            } catch (InterruptedException e) {
                // Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("EXCEPCION DETECTADA");
            }

        }

    }

}
