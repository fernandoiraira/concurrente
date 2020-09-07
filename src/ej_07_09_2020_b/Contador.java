/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej_07_09_2020_b;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Contador {


public static void main(String[] args) throws InterruptedException {

final Dato unContador = new Dato();

RunnableCdor   unRunCdor = new RunnableCdor(unContador);


Thread h1= new Thread( unRunCdor);
Thread h2= new Thread( unRunCdor);
h1.start();
h2.start();
h1.join();
h2.join();
System.out.println("en main-" + unContador.getValor());

}

}
