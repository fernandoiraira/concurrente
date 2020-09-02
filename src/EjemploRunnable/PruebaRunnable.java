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
public class PruebaRunnable {

    public static void main(String[] args) {
        //2 objetos definen los metodos run
        PingPong o1 = new PingPong("PING", 33);
        PingPong o2 = new PingPong("PONG", 10);

        //Se crean los hilos, con los objetos que se tienen que ejecutar concurrentemente
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        //Se activan los hilos
        t1.start();
        t2.start();
    }

}
