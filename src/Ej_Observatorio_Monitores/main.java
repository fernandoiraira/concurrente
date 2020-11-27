/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_Observatorio_Monitores;

import java.util.Random;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class main {

    public static void main(String[] args) {
        int capacidadMaxima = 5;
        int capacidadLimitada = 3;
        int cantVisitantes = 30;
        int cantMantenimiento = 7;
        int cantInvestigadores = 5;

        Random r = new Random();

        Observatorio obs = new Observatorio(capacidadMaxima, capacidadLimitada);

        for (int i = 1; i <= cantVisitantes; i++) {
            Visitante v = new Visitante(obs, r.nextInt(5));
            Thread visitante = new Thread(v, "Visitante " + i);
            visitante.start();
        }

        for (int i = 1; i <= cantMantenimiento; i++) {
            Mantenimiento m = new Mantenimiento(obs);
            Thread mantenimiento = new Thread(m, "Mantenimiento " + i);
            mantenimiento.start();

        }

        for (int i = 1; i <= cantInvestigadores; i++) {
            Investigador in = new Investigador(obs);
            Thread investigador = new Thread(in, "Investigador " + i);
            investigador.start();

        }

    }

}
