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
public class ProcesoI implements Runnable {

    private Datos unDato;

    public ProcesoI(Datos unD) {
        unDato = unD;
    }

    public void run() {
        for (int i = 1; i < 10000; i++) {
            unDato.incrementar();
            System.out.println(unDato.getDato());
        }
    }

}
