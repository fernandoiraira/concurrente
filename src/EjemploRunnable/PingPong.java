/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploRunnable;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PingPong implements Runnable {

    private String cadena;
    private int delay;

    public PingPong(String cartel, int cantMS) {
        cadena = cartel;
        delay = cantMS;
    }

    @Override
    public void run() {

        for (int i = 1; i < delay * 10; i++) {
            System.out.println(cadena + " ");

            try {
                Thread.sleep(delay);
            } catch (Exception e) {

            }
        }
    }
}
