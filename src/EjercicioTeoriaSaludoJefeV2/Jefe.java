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
public class Jefe implements Runnable {

    private Oficina oficina;

    public Jefe(Oficina oficina) {
        this.oficina = oficina;
    }

    public void run() {
        oficina.saludoJefe();
    }

}
