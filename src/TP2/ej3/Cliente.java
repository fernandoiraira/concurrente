/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej3;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente implements Runnable {

    @Override
    public void run() {
        System.out.println("soy " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }

}
