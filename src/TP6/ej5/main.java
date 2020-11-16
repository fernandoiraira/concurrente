/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.ej5;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        //SE PUDO RESOLVER EL PROBLEMA CUANDO TENGO MUCHOS MENOS AUTOS EN UN LADO QUE EN OTRO
        
        int limite = 3;
        int cantAutosNorteSur = 5;
        int cantAutosSurNorte = 20;

        Puente p = new Puente(limite, cantAutosNorteSur, cantAutosSurNorte);

        for (int i = 1; i <= cantAutosNorteSur; i++) {
            Auto a = new Auto(p, true);
            Thread autoNorte = new Thread(a, "Auto Norte " + i);
            autoNorte.start();
        }

        for (int i = 1; i <= cantAutosSurNorte; i++) {
            Auto a = new Auto(p, false);
            Thread autoSur = new Thread(a, "Auto Sur " + i);
            autoSur.start();
        }

    }

}
