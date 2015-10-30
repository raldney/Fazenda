/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

import java.nio.Buffer;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Raldney
 */

public class Fazendeiro extends Thread {
    private String nomeFazendeiro;
    private Comedouro comedouro;
    private Random r;
    public Fazendeiro(String nome, Comedouro c) {
        nomeFazendeiro = nome;
        comedouro = c;
        r = new Random();
    }
 
    public void run() {
        int i = 0;
        System.out.println("Fazendeiro " + nomeFazendeiro + " começou a trabalhar!");

        while(i < 300){
            comedouro.encher(nomeFazendeiro, r.nextInt(2) + 100);
            i++;
        }
        System.out.println("Fazendeiro " + nomeFazendeiro + " Terminou seu Serviço");

    }
}
