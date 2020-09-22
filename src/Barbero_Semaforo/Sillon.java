/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barbero_Semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Sillon {

    private Semaphore semSillon = new Semaphore(1);
    private Semaphore semBarbero = new Semaphore(0);
    private Semaphore semSalida = new Semaphore(0);
    
    public void sentarse(){
        try{
            semSillon.acquire();
            System.out.println(Thread.currentThread().getName() + " se sienta en el sillon.");
            semBarbero.release();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " se levanta del sillon.");
            semSillon.release();
        }catch(Exception e){
        }      
    }   
}
