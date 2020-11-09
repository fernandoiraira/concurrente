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
public class main {

    public static void main(String[] args) {
        int cantEmpleados = 20;

        Oficina oficina = new Oficina(cantEmpleados);

        Jefe jefe = new Jefe(oficina);
        Thread j = new Thread(jefe);
        j.start();

        for (int i = 1; i <= cantEmpleados; i++) {
            Personal p = new Personal(oficina);
            Thread personal = new Thread(p, "Empleado " + i);
            personal.start();
        }

    }

}
