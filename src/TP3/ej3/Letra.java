/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej3;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class Letra implements Runnable {

    private String cadena;
    private Coordinador coordinador;
    //Se podria utilizar un int privado que me indique cuantas veces se quiere imprimir la letra correspondiente

    public Letra(String cadena, Coordinador coordinador) {
        this.cadena = cadena;
        this.coordinador = coordinador;
    }

    public void run() {
        //Este for es opcional, es por si se quiere mostrar la secuencia de letras más de una vez
        for (int i = 0; i < 10; i++) {
            while (!coordinador.esTurno(cadena)) {
                //Acá podría ir un sleep();
            }
            //Se muestra la letra correspondiente al turno
            System.out.println(cadena);
            //Se pasa al siguiente turno
            coordinador.next();
        }
    }

}
