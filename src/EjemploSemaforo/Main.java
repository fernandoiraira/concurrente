/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSemaforo;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Datos dato = new Datos(0);

        for (int i = 1; i <= 2; i++) {
            ProcesoI p = new ProcesoI(dato);
            Thread t = new Thread(p);

            t.start();
        }

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

    }
}
