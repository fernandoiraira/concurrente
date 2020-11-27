/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_Blancanieves;

/*
 * Mauricio Sawicki
 */
/**
 *
 * @author mausa
 */
public class Main {

    public static void main(String[] args) {

        int cantSillas = 4;
        int cantEnanos = 3;

        Mesa unaMesa = new Mesa(cantSillas);
        Blancanieves b = new Blancanieves(unaMesa);

        Thread hiloBlancanieves = new Thread(b, "Blancanieves");
        hiloBlancanieves.start();
        for (int i = 1; i <= cantEnanos; i++) {
            Enanito e1 = new Enanito(unaMesa);
            Thread hiloEnanitos = new Thread(e1, "Enanito " + i);
            hiloEnanitos.start();
        }

    }
}
